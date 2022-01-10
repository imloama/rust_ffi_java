# go编译成动态库，被java调用

go build -buildmode=c-shared -o golib.dll ./main.go

go build -buildmode=c-shared -o golib.so ./main.go

