@if "%DEBUG%" == "" @echo off
@rem ##########################################################################
@rem
@rem  yoink-core startup script for Windows
@rem
@rem ##########################################################################

@rem Set local scope for the variables with windows NT shell
if "%OS%"=="Windows_NT" setlocal

@rem Add default JVM options here. You can also use JAVA_OPTS and YOINK_CORE_OPTS to pass JVM options to this script.
set DEFAULT_JVM_OPTS=

set DIRNAME=%~dp0
if "%DIRNAME%" == "" set DIRNAME=.
set APP_BASE_NAME=%~n0
set APP_HOME=%DIRNAME%..

@rem Find java.exe
if defined JAVA_HOME goto findJavaFromJavaHome

set JAVA_EXE=java.exe
%JAVA_EXE% -version >NUL 2>&1
if "%ERRORLEVEL%" == "0" goto init

echo.
echo ERROR: JAVA_HOME is not set and no 'java' command could be found in your PATH.
echo.
echo Please set the JAVA_HOME variable in your environment to match the
echo location of your Java installation.

goto fail

:findJavaFromJavaHome
set JAVA_HOME=%JAVA_HOME:"=%
set JAVA_EXE=%JAVA_HOME%/bin/java.exe

if exist "%JAVA_EXE%" goto init

echo.
echo ERROR: JAVA_HOME is set to an invalid directory: %JAVA_HOME%
echo.
echo Please set the JAVA_HOME variable in your environment to match the
echo location of your Java installation.

goto fail

:init
@rem Get command-line arguments, handling Windowz variants

if not "%OS%" == "Windows_NT" goto win9xME_args
if "%@eval[2+2]" == "4" goto 4NT_args

:win9xME_args
@rem Slurp the command line arguments.
set CMD_LINE_ARGS=
set _SKIP=2

:win9xME_args_slurp
if "x%~1" == "x" goto execute

set CMD_LINE_ARGS=%*
goto execute

:4NT_args
@rem Get arguments from the 4NT Shell from JP Software
set CMD_LINE_ARGS=%$

:execute
@rem Setup the command line

set CLASSPATH=%APP_HOME%\lib\yoink-core-0.0.2.jar;%APP_HOME%\lib\log4j-1.2.16.jar;%APP_HOME%\lib\hibernate-validator-5.2.0.Alpha1.jar;%APP_HOME%\lib\spring-oxm-4.1.3.RELEASE.jar;%APP_HOME%\lib\spock-core-0.7-groovy-2.0.jar;%APP_HOME%\lib\commons-collections-3.2.jar;%APP_HOME%\lib\groovy-all-2.4.3.jar;%APP_HOME%\lib\commons-io-1.4.jar;%APP_HOME%\lib\guava-18.0.jar;%APP_HOME%\lib\commons-math3-3.3.jar;%APP_HOME%\lib\commons-lang3-3.1.jar;%APP_HOME%\lib\spring-jms-4.2.4.RELEASE.jar;%APP_HOME%\lib\activemq-broker-5.13.0.jar;%APP_HOME%\lib\activemq-core-5.7.0.jar;%APP_HOME%\lib\spring-boot-starter-batch-1.1.7.RELEASE.jar;%APP_HOME%\lib\yoink-core-bootstrap-0.0.2.jar;%APP_HOME%\lib\jboss-logging-3.1.3.GA.jar;%APP_HOME%\lib\classmate-1.0.0.jar;%APP_HOME%\lib\junit-dep-4.10.jar;%APP_HOME%\lib\hamcrest-core-1.3.jar;%APP_HOME%\lib\spring-messaging-4.2.4.RELEASE.jar;%APP_HOME%\lib\spring-tx-4.2.4.RELEASE.jar;%APP_HOME%\lib\activemq-client-5.13.0.jar;%APP_HOME%\lib\activemq-openwire-legacy-5.13.0.jar;%APP_HOME%\lib\geronimo-jms_1.1_spec-1.1.1.jar;%APP_HOME%\lib\kahadb-5.7.0.jar;%APP_HOME%\lib\activemq-protobuf-1.1.jar;%APP_HOME%\lib\mqtt-client-1.3.jar;%APP_HOME%\lib\geronimo-j2ee-management_1.1_spec-1.0.1.jar;%APP_HOME%\lib\commons-net-3.1.jar;%APP_HOME%\lib\jasypt-1.9.0.jar;%APP_HOME%\lib\spring-boot-starter-1.1.7.RELEASE.jar;%APP_HOME%\lib\hsqldb-2.3.2.jar;%APP_HOME%\lib\spring-jdbc-4.0.7.RELEASE.jar;%APP_HOME%\lib\spring-batch-core-3.0.1.RELEASE.jar;%APP_HOME%\lib\yoink-core-api-0.0.2.jar;%APP_HOME%\lib\yoink-core-math-0.0.2.jar;%APP_HOME%\lib\yoink-core-molecular-0.0.2.jar;%APP_HOME%\lib\yoink-core-density-0.0.2.jar;%APP_HOME%\lib\yoink-core-regionizer-0.0.2.jar;%APP_HOME%\lib\yoink-core-adaptive-0.0.2.jar;%APP_HOME%\lib\hawtbuf-1.11.jar;%APP_HOME%\lib\hawtdispatch-transport-1.11.jar;%APP_HOME%\lib\spring-boot-1.1.7.RELEASE.jar;%APP_HOME%\lib\spring-boot-autoconfigure-1.1.7.RELEASE.jar;%APP_HOME%\lib\snakeyaml-1.13.jar;%APP_HOME%\lib\com.ibm.jbatch-tck-spi-1.0.jar;%APP_HOME%\lib\xstream-1.4.7.jar;%APP_HOME%\lib\jettison-1.2.jar;%APP_HOME%\lib\spring-batch-infrastructure-3.0.1.RELEASE.jar;%APP_HOME%\lib\yoink-core-cube-0.0.2.jar;%APP_HOME%\lib\hawtdispatch-1.11.jar;%APP_HOME%\lib\javax.batch-api-1.0.jar;%APP_HOME%\lib\xmlpull-1.1.3.1.jar;%APP_HOME%\lib\xpp3_min-1.1.4c.jar;%APP_HOME%\lib\spring-retry-1.1.0.RELEASE.jar;%APP_HOME%\lib\validation-api-1.1.0.Final.jar;%APP_HOME%\lib\spring-beans-4.2.4.RELEASE.jar;%APP_HOME%\lib\spring-core-4.2.4.RELEASE.jar;%APP_HOME%\lib\commons-logging-1.2.jar;%APP_HOME%\lib\spring-aop-4.2.4.RELEASE.jar;%APP_HOME%\lib\aopalliance-1.0.jar;%APP_HOME%\lib\spring-context-4.2.4.RELEASE.jar;%APP_HOME%\lib\slf4j-api-1.7.13.jar;%APP_HOME%\lib\spring-expression-4.2.4.RELEASE.jar

@rem Execute yoink-core
"%JAVA_EXE%" %DEFAULT_JVM_OPTS% %JAVA_OPTS% %YOINK_CORE_OPTS%  -classpath "%CLASSPATH%" org.wallerlab.yoink.Yoink %CMD_LINE_ARGS%

:end
@rem End local scope for the variables with windows NT shell
if "%ERRORLEVEL%"=="0" goto mainEnd

:fail
rem Set variable YOINK_CORE_EXIT_CONSOLE if you need the _script_ return code instead of
rem the _cmd.exe /c_ return code!
if  not "" == "%YOINK_CORE_EXIT_CONSOLE%" exit 1
exit /b 1

:mainEnd
if "%OS%"=="Windows_NT" endlocal

:omega
