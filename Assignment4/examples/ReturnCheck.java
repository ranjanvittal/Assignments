MAIN
    PRINT 
    BEGIN
        MOVE TEMP 32
            BEGIN
                MOVE TEMP 34 HALLOCATE 4
                MOVE TEMP 35 HALLOCATE 16
                HSTORE TEMP 35 0 Size_4_Test_f1
                HSTORE TEMP 35 4 Size_4_Test_foo
                HSTORE TEMP 35 8 Size_4_Test_f3
                HSTORE TEMP 35 12 Size_4_Test_f2
                MOVE TEMP 36 4
                L0
                CJUMP LT TEMP 36 4 L1
                HSTORE PLUS TEMP 34 TEMP 36 0 0
                MOVE TEMP 36 PLUS TEMP 36 4
                JUMP L0
                L1
                HSTORE TEMP 34 0 TEMP 35
                RETURN TEMP 34
            END
        HLOAD TEMP 37 TEMP 32 0
        HLOAD TEMP 38 TEMP 37 4
        RETURN
        CALL TEMP 38
        (
            TEMP 32
            10
        )
    END
END
    Size_4_Test_foo [ 1 ]
    BEGIN
        MOVE TEMP 39
        PLUS
            TIMES
                BEGIN
                    RETURN TEMP 1
                END
                12
            3
        RETURN TEMP 39
    END
    Size_4_Test_f1 [ 0 ]
    BEGIN
        MOVE TEMP 31
            BEGIN
            MOVE TEMP 41
            3
                MOVE TEMP 42 HALLOCATE TIMES 4 PLUS 1 TEMP 41
                HSTORE TEMP 42 0 TEMP 41
                MOVE TEMP 43 4
                L2
                CJUMP LT TEMP 43 TIMES 4 PLUS 1 TEMP 41 L3
                HSTORE PLUS TEMP 42 TEMP 43 0 0
                MOVE TEMP 43 PLUS TEMP 43 4
                JUMP L2
                L3 NOOP
                RETURN TEMP 42
            END
        MOVE TEMP 44
        BEGIN
            RETURN TEMP 31
        END
        RETURN TEMP 44
    END
    Size_4_Test_f2 [ 0 ]
    BEGIN
        MOVE TEMP 45
        BEGIN
            MOVE TEMP 47 HALLOCATE 4
            MOVE TEMP 48 HALLOCATE 16
            HSTORE TEMP 48 0 Size_4_Test_f1
            HSTORE TEMP 48 4 Size_4_Test_foo
            HSTORE TEMP 48 8 Size_4_Test_f3
            HSTORE TEMP 48 12 Size_4_Test_f2
            MOVE TEMP 49 4
            L4
            CJUMP LT TEMP 49 4 L5
            HSTORE PLUS TEMP 47 TEMP 49 0 0
            MOVE TEMP 49 PLUS TEMP 49 4
            JUMP L4
            L5
            HSTORE TEMP 47 0 TEMP 48
            RETURN TEMP 47
        END
        RETURN TEMP 45
    END
    Size_4_Test_f3 [ 0 ]
    BEGIN
        MOVE TEMP 50
        1
        RETURN TEMP 50
    END
