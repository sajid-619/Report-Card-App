Chart and Graph Library for Android
What is GraphView

GraphView is a library for Android to programmatically create flexible and nice-looking diagramms. It is easy to understand, to integrate and to customize it. At the moment there are two different types:

Line Charts
Bar Charts
Tested on Android 1.6, 2.2, 2.3 and 3.0 (honeycomb, tablet), 4.0.

  

Features

Two chart types Line Chart and Bar Chart.
Draw multiple series of data Let the diagram show more that one series in a graph. You can set a color and a description for every series.
Show legend A legend can be displayed inline the chart. You can set the width and the vertical align (top, middle, bottom).
Custom labels The labels for the x- and y-axis are generated automatically. But you can set your own labels, Strings are possible.
Handle incomplete data It's possible to give the data in different frequency.
Viewport You can limit the viewport so that only a part of the data will be displayed.
Scrolling You can scroll with a finger touch move gesture.
Scaling / Zooming Since Android 2.3! With two-fingers touch scale gesture (Multi-touch), the viewport can be changed.
Background (line graph) Optionally draws a light background under the diagram stroke.
Manual Y axis limits
Realtime Graph (Live)
And more
How to use

View GraphView page 
http://android-graphview.org

Important

To show you how to integrate the library into an existing project see the GraphView-Demos project! See GraphView-Demos for examples. https://github.com/jjoe64/GraphView-Demos
View GraphView page http://android-graphview.org

How to create a new version for maven repo

create sources.jar

$ jar cvf sources.jar src
create java doc jar

$ mkdir javadoc
$ javadoc -d javadoc -sourcepath src/main/java/ -subpackages com.jjoe64
$ jar cvf javadoc.jar javadoc
change version in gradle.properties

uncomment part for publishing in build.gradle

run gradle task uploadArchives

./gradlew --rerun-tasks uploadArchives
open https://oss.sonatype.org

login

Staging Repositiories

search: jjoe64

Close entry

Refresh/Wait

Release entry

Wait some days

How to create a new .jar file

run this gradle task

./gradlew --rerun-tasks clearJar makeJar copy myCompiledLibrary.jar from build/libs/ to public/GraphView-x.x.x.jar
