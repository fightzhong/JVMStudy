```
格式:
    -XX:+<option>: 表示开启option选项
    -XX:-<option>: 表示关闭option选项
    -XX:<option> = <value>: 将option选项的值设为value

使用:
    <1> -XX:+TraceClassLoading: 用于追踪类的加载信息并打印出来
    <2> -XX:+TraceClassUnloading: 用户追踪类的卸载信息并打印出来
    <3> -XX:+HeapDumpOnOutOfMemoryError: 将堆遇到问题的现场信息转储到一个文件中
    <4> -XX:MaxMetaspaceSize=?m: 将元空间的大小设置为?m
    <5> -XX:+PrintGCDetails: 表示打印GC的详细信息
    <6> -XX:SurvivorRatio=?: 设置eden空间与survivor空间的比例为8:1:1(可以理解为eden空间占8份)

    -Xms?m: 设置堆空间的最小内存为?M
    -Xmx?m: 设置堆空间的最大内存为?M
    -Xmn?m: 设置堆空间的新生代的大小为?M
    -Xss?k: 设置堆栈的大小为?K 

-verbose:gc: 详细的输出垃圾回收相关的日志     
```












