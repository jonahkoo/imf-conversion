@echo off
pushd %~dp0
call .\usage-one %* && ^
.\itunes-metadata %1 ..\..\CPL\chimera25\CPL-short.xml "%~2\Chimera25-Short-metadata" "vendor_id" ..\chimera25\metadata.xml %3