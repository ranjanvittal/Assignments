MAIN
    PRINT 
    BEGIN
        MOVE TEMP 32
            BEGIN
                MOVE TEMP 34 HALLOCATE 4
                MOVE TEMP 35 HALLOCATE 8
                HSTORE TEMP 35 0 Size_4_Test_foo
                HSTORE TEMP 35 4 Size_4_Test_bar
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
        HLOAD TEMP 38 TEMP 37 0
        RETURN
        CALL TEMP 38
        (
            TEMP 32
            5
        )
    END
END
    Size_1_A_fn [ 0 ]
    BEGIN
        MOVE TEMP 39
        BEGIN
            MOVE TEMP 41 HALLOCATE 4
            MOVE TEMP 42 HALLOCATE 8
            HSTORE TEMP 42 0 Size_4_Test_foo
            HSTORE TEMP 42 4 Size_4_Test_bar
            MOVE TEMP 43 4
            L2
            CJUMP LT TEMP 43 4 L3
            HSTORE PLUS TEMP 41 TEMP 43 0 0
            MOVE TEMP 43 PLUS TEMP 43 4
            JUMP L2
            L3
            HSTORE TEMP 41 0 TEMP 42
            RETURN TEMP 41
        END
        RETURN TEMP 39
    END
    Size_4_Test_foo [ 1 ]
    BEGIN
        MOVE TEMP 31
            BEGIN
                MOVE TEMP 45 HALLOCATE 4
                MOVE TEMP 46 HALLOCATE 4
                HSTORE TEMP 46 0 Size_1_A_fn
                MOVE TEMP 47 4
                L4
                CJUMP LT TEMP 47 4 L5
                HSTORE PLUS TEMP 45 TEMP 47 0 0
                MOVE TEMP 47 PLUS TEMP 47 4
                JUMP L4
                L5
                HSTORE TEMP 45 0 TEMP 46
                RETURN TEMP 45
            END
        PRINT 
        PLUS
            BEGIN
                RETURN TEMP 1
            END
            BEGIN
                MOVE TEMP 48
                    BEGIN
                        MOVE TEMP 49
                            BEGIN
                                RETURN TEMP 31
                            END
                        HLOAD TEMP 50 TEMP 49 0
                        HLOAD TEMP 51 TEMP 50 0
                        RETURN
                        CALL TEMP 51
                        (
                            TEMP 49
                        )
                    END
                HLOAD TEMP 52 TEMP 48 0
                HLOAD TEMP 53 TEMP 52 4
                RETURN
                CALL TEMP 53
                (
                    TEMP 48
                )
            END
        MOVE TEMP 54
        33
        RETURN TEMP 54
    END
    Size_4_Test_bar [ 0 ]
    BEGIN
        MOVE TEMP 55
        1
        RETURN TEMP 55
    END
