This repository demonstrates https://github.com/oracle/graal/issues/2694

# Prerequisites

1. Install GraalVM
2. Put its `bin` on the `PATH`
3. Install `native-image` tool with `gu install native-image`

# Build

`./build.sh`

# Run

`./app`

This produces the following output:

```
Exception in thread "main" com.oracle.svm.core.jdk.UnsupportedFeatureError: Unsupported method of Unsafe
	at com.oracle.svm.core.util.VMError.unsupportedFeature(VMError.java:87)
	at jdk.internal.misc.Unsafe.staticFieldOffset(Unsafe.java:230)
	at sun.misc.Unsafe.staticFieldOffset(Unsafe.java:662)
	at Test.main(Test.java:9)
```
