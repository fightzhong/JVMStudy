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
  <7> -XX:UseParallelGC(JVM启动的默认参数): 指定JVM的垃圾回收器是Parallel Scavenge和
                                          Parallel Old
  <8> -XX: PretenureSizeThreshold=xxx: 当我们创建的对象的大小超过了阈值xxx字节, 则这个对象会
                                        直接在老年代创建, 必须在串行的GC下才能生效, 即必须显示
                                        的指示-XX:+UseSerialGC, 并且必须对新生代空间的大小或
                                        者堆空间的大小进行显示的设置才能生效(-Xms, -Xmx, -Xmn)
  <9> -XX:+UseSerialGC: 使用串行垃圾收集器(Serial + Serial Old)
  <10> -XX:+PrintCommandLineFlags: 在程序启动时打印JVM启动参数
  <11> -XX:MaxTenuringThreshold=?: 在可以自动调节对象晋升到老年代年龄的GC中, 设置该年龄的最大值
                                    默认值是15, CMS中默认值为6, G1中默认为15(在JVM中, 该数值
                                    是由4个bit表示, 所以最大值为1111, 即15) 
      例子: 当我们设置为5的时候, 如果一个对象在新生代经历了5次GC还存在, 则会将其放入老年代, 这
            个5为最大值, 即不会超过5次, 但是可以低于5次, 这个由JVM自己判断 

      注意: 经历了多次GC后, 存活的对象会在From Survivor与To Survivor之间来回存放, 而这里面的
            一个前提则是这两个空间有足够的大小来存放这些数据, 在GC算法中, 会计算每个对象年龄的
            大小, 如果达到某个年龄后发现总大小已经大于了survivor空间的50%, 那么这时候就需要自动
            调整阈值(最大年龄), 不能再等到默认的15次GC才完成晋升, 因为这样会导致Survivor空间不
            足, 而空间不足就会导致新创建的对象直接在老年代创建, 所以需要调整阈值(最大年龄), 让
            这些存活对象尽快完成晋升

  <12> -XX:+PrintTenuringDistribution: 打印在survivor空间中对象的年龄情况, 如有多少个对象年龄
                                      为1, 多少个对象年龄为2....
  <13> -XX:TargetSurvivorRatio=? : 设置survivor空间在达到了多大的时候进行年龄阈值的调整, 如设置
                                    了60, 则表示在from-space中空间使用达到了60%的时候就进行年
                                    龄阈值的调整, 降低年龄阈值, 从而使得fromspace中经历了多次垃
                                    圾回收时仍然存活的对象尽快的进入老年代, 防止eden可用空间过
                                    小, 进而防止对象直接在老年代中直接创建
  <14> -XX:+PrintGCDateStamps: 执行GC的时间戳, 即当前时间                                    

  -Xms?m: 设置堆空间的最小内存为?M
  -Xmx?m: 设置堆空间的最大内存为?M
  -Xmn?m: 设置堆空间的新生代的大小为?M
  -Xss?k: 设置堆栈的大小为?K 

  -verbose:gc: 详细的输出垃圾回收相关的日志  

垃圾收集器的开启:
  <1> 默认为-UseParallelGC(Parallel Scavenge和Parallel Old)
  <2> -XX:UseSerialGC(Serial + Serial Old)
  <3> -XX:UseConcMarkSweepGC(CMS垃圾收集器, 老年代)
  <4> -XX:UseParNew(ParNew, 新生代)
```












