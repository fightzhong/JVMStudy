```
格式:
    -XX:+<option>: 表示开启option选项
    -XX:-<option>: 表示关闭option选项
    -XX:<option> = <value>: 将option选项的值设为value

使用:
    <1> -XX:+TraceClassLoading: 用于追踪类的加载信息并打印出来
    <2> -XX:+TraceClassUnloading: 用户追踪类的卸载信息并打印出来
    <3> -XX:+HeapDumpOnOutOfMemoryError: 将堆遇到问题的现场信息转储到一个文件中

    -Xms?m: 设置堆空间的最小内存为?M
    -Xmx?m: 设置堆空间的最大内存为?M
    -Xss?k: 设置堆栈的大小为?K
```












