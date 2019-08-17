## JDK自带的性能查看分析工具
- 命令行查看JVM信息
	```
	jmap -clstats PID: 查看当前Java进程的类加载器信息
	jmap -heap PID: 堆的信息
	jstat -gc PID: 打印元空间的内存使用信息(MC表示元空间大小, MU表示已经使用的元空间大小)
	jstack pid: 获取指定线程的堆栈信息
	jhat: 会开启一个指定的端口, 从而可以在浏览器中利用OQL语法来分析heap dump文件

	jcmd命令需要配合JVM参数[-XX:+UnlockDiagnosticVMOptions]使用
	jcmd -h: 查看jcmd命令的使用帮助
	jcmd -l(jcmd, jps -l): 查看所有的Java进程
	jcmd [pid, mainclass] help: 查看对该Java进程可使用的命令参数
	jcmd [pid, mainclass] help command: 查看对应的命令可加入的选项
		jcmd pid GC.class_histogram: 查看对应的Java进程的类的统计信息
		jcmd pid GC.class_stats: 查看对应的Java进程的已经加载的类的信息
		jcmd pid GC.heap_dump 文件名.hprof: 将此时的堆信息转储成一个文件(可用jvisualvm查看)
		jcmd pid VM.flags: 查看JVM的启动参数
		jcmd pid VM.uptime: 查看JVM的启动时长
		jcmd pid Thread.print: 查看线程的堆栈信息
		jcmd pid PerfCounter.print: 查看JVM性能相关的信息
		jcmd pid VM.command_line: 查看JVM启动的命令行参数
	```

-	图形化工具
	```
	jvisualvm
	jconsole(有一个死锁检测功能)
	jmc: 相比于前两个更加的强大, 界面更加的美观
	```
			