#!/usr/bin/env python
#---------------------------------------------------------------------------# 
# initialization
#---------------------------------------------------------------------------# 
try: # if not installed, install and proceed
    from setuptools import setup, find_packages
except ImportError:
    from ez_setup import use_setuptools
    use_setuptools()
    from setuptools import setup, find_packages

try:
    from setup_commands import command_classes
except ImportError:
    command_classes = {}
from cakery import __version__, __author__

#---------------------------------------------------------------------------# 
# configuration
#---------------------------------------------------------------------------# 
setup(name  = 'cakery',
    version = __version__,
    description = 'A collection of fair division algorithms in python',
    long_description='''
    A collection of fair division algorithms in python.
    ''',
    classifiers = [
        'Development Status :: 4 - Beta',
        'Intended Audience :: Developers',
        'License :: OSI Approved :: BSD License',
        'Operating System :: POSIX :: Linux',
        'Operating System :: Unix',
        'Programming Language :: Python',
        'Topic :: Utilities'
    ],
    keywords = 'fair, division, cake',
    author = __author__,
    author_email = 'bashwork@gmail.com',
    maintainer = __author__,
    maintainer_email = 'bashwork@gmail.com',
    url='http://github.com/bashwork/',
    license = 'BSD',
    packages = find_packages(exclude=['examples', 'test']),
    exclude_package_data = {'' : ['examples', 'test', 'tools', 'doc']},
    py_modules = ['ez_setup'],
    platforms = ['Linux', 'Mac OS X', 'Win'],
    include_package_data = True,
    zip_safe = True,
    install_requires = [],
    extras_require = {
        'quality'   : [ 'coverage >= 3.5.3', 'nose >= 1.2.1', 'mock >= 1.0.0', 'pep8 >= 1.3.3' ],
        'documents' : [ 'sphinx >= 1.1.3' ],
    },
    test_suite = 'nose.collector',
    cmdclass = command_classes,
)
