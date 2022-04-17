# AlgorithmExercises
## Just record the code exercises which mostly in Leetcode. 
## Just for fun.
## Windows VSCode compile C++ with Clang
### Install msys2
> pacman -Syu //update 
pacman -S --needed base-devel mingw-w64-ucrt-x86_64-clang mingw-w64-ucrt-x86_64-gdb
### Export Environment in MSYS2 MinGW UCRT 64-bit
```shell
clang --version #Windows PATH
nano .bashrc
export PATH=$PATH:{Your VsCode Path}/Microsoft\ VS\ Code/bin
CTRL+O CTRL+X
source .bashrc
```
### Config tasks.json(Default g++)
```json
"command": "D:\\Software\\msys2\\ucrt64\\bin\\clang++.exe"
"args": [
                "-fdiagno stics-color=always",
                "-std=c++20",
                "-Wall",
                "-Wextra",
                "-g",
                "${file}",
                "-o",
                "${fileDirname}\\${fileBasenameNoExtension}.exe"
```
### Reference [vscode clang](https://solarianprogrammer.com/2021/06/11/install-clang-windows-msys2-mingw-w64/)