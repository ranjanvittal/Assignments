for i in examples/*.java;
do
#echo $i;
    java P4 < $i > tempfile;
    java -jar pgi.jar < tempfile > tmpoutput;
    cd examples/;
    j=`echo $i | sed 's/\([^\/]*\/\)\(.*\)/\2/'`;
    java -jar pgi.jar < $j > ../tmpoutput2
    echo $j;
#javac $j;
#class=`echo $j | sed 's/\([^\.]*\)\(.java\)/\1/'`;
#echo $class;
#java  $class> ../tmpoutput2;
    cd ../;
    diff tmpoutput2 tmpoutput > /dev/null;
    if [ $? -eq 0 ]
        then
        echo "Successful"
        else
        echo $j;
        echo "Failed"
    fi
    cd microIR/;
    javac Main.java;
    java Main < ../tempfile;
    cd ../;
    rm tmpoutput tmpoutput2
done
