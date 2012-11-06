from distutils.core import Command
import sys, os, shutil

#---------------------------------------------------------------------------# 
# Extra Commands
#---------------------------------------------------------------------------# 
class DeepCleanCommand(Command):
    ''' Helper command to return the directory to a completely
        clean state.
    '''
    description  = "clean everything that we don't want"
    user_options = []

    def initialize_options(self):
        ''' options setup '''
        self.trash = ['build', 'dist', 'cakery.egg-info' ]

    def finalize_options(self):
        pass

    def run(self):
        ''' command runner '''
        self.__delete_pyc_files()
        self.__delete_trash_dirs()

    def __delete_trash_dirs(self):
        ''' remove all directories created in building '''
        self.__delete_pyc_files()
        for directory in self.trash:
            if os.path.exists(directory):
                shutil.rmtree(directory)

    def __delete_pyc_files(self):
        ''' remove all python cache files '''
        for root,dirs,files in os.walk('.'):
            for file in files:
                if file.endswith('.pyc'):
                    os.remove(os.path.join(root,file))

class LintCommand(Command):
    ''' Helper command to perform a lint scan of the
    sourcecode and return the results.
    '''
    description  = "perform a lint scan of the code"
    user_options = []

    def initialize_options(self):
        ''' options setup '''
        if not os.path.exists('./build'):
            os.mkdir('./build')

    def finalize_options(self):
        pass

    def run(self):
        ''' command runner '''
        scanners = [s for s in dir(self) if s.find('__try') >= 0]
        for scanner in scanners:
            if getattr(self, scanner)():
                break

    def __try_pyflakes(self):
        try:
            from pyflakes.scripts.pyflakes import main
            sys.argv = '''pyflakes cakery'''.split()
            main()
            return True
        except: return False

    def __try_pychecker(self):
        try:
            import pychecker
            sys.argv = '''pychecker cakery/*.py'''.split()
            main()
            return True
        except: return False

    def __try_pylint(self):
        try:
            import pylint
            sys.argv = '''pylint cakery/*.py'''.split()
            main()
            return True
        except: return False

class Python3Command(Command):
    ''' Helper command to scan for potential python 3
    errors.

    ./setup.py scan_2to3 > build/diffs_2to3 build/report_2to3
    '''
    description  = "perform 2to3 scan of the code"
    user_options = []

    def initialize_options(self):
        ''' options setup '''
        if not os.path.exists('./build'):
            os.mkdir('./build')
        self.directories = ['cakery', 'test']

    def finalize_options(self):
        pass

    def run(self):
        ''' command runner '''
        self.__run_python3()

    def __run_python3(self):
        try:
            from lib2to3.main import main
            sys.argv = ['2to3'] + self.directories
            main("lib2to3.fixes")
            return True
        except: return False

class Pep8Command(Command):
    ''' Helper command to scan for potential pep8 violations
    '''
    description  = "perform pep8 scan of the code"
    user_options = []

    def initialize_options(self):
        ''' options setup '''
        if not os.path.exists('./build'):
            os.mkdir('./build')
        self.directories = ['cakery']

    def finalize_options(self):
        pass

    def run(self):
        ''' command runner '''
        self.__run_pep8()

    def __run_pep8(self):
        try:
            from pep8 import _main as main
            sys.argv = '''pep8 --repeat --count --statistics
            '''.split() + self.directories
            main()
            return True
        except: return False

#---------------------------------------------------------------------------# 
# Command Configuration
#---------------------------------------------------------------------------# 
command_classes = {
    'deep_clean'    : DeepCleanCommand,
    'lint'          : LintCommand,
    'scan_2to3'     : Python3Command,
    'pep8'          : Pep8Command,
}

#---------------------------------------------------------------------------# 
# Export command list
#---------------------------------------------------------------------------# 
__all__ = ['command_classes']
