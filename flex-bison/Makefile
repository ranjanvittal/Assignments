all: test1 test2 test3 test4 test5

test1: test1.l
	flex test1.l
	gcc lex.yy.c -o test1 -ll

test2: test2.l
	flex test2.l
	gcc lex.yy.c -o test2 -ll

test3: test3.l test3.y
	bison -d test3.y
	flex test3.l
	gcc -o test3 lex.yy.c test3.tab.c

test4: test4.l test4.y
	bison -d test4.y
	flex test4.l
	gcc -o test4 lex.yy.c test4.tab.c -ll

test5: test5.l test5.y
	bison -d test5.y
	flex test5.l
	gcc -o test5 lex.yy.c test5.tab.c -ll

clean:
	rm -f *.yy.c  *.tab.c *.tab.h test1 test2 test3 test4 test5
