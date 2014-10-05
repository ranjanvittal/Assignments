MAIN
    PRINT 
    BEGIN
        MOVE TEMP 34
            BEGIN
                MOVE TEMP 36 HALLOCATE 4
                MOVE TEMP 37 HALLOCATE 8
                HSTORE TEMP 37 0 Size_4_Test_foo
                HSTORE TEMP 37 4 Size_4_Test_bar
                MOVE TEMP 38 4
                L0
                CJUMP LT TEMP 38 4 L1
                HSTORE PLUS TEMP 36 TEMP 38 0 0
                MOVE TEMP 38 PLUS TEMP 38 4
                JUMP L0
                L1
                HSTORE TEMP 36 0 TEMP 37
                RETURN TEMP 36
            END
        HLOAD TEMP 39 TEMP 34 0
        HLOAD TEMP 40 TEMP 39 0
        RETURN
        CALL TEMP 40
        (
            TEMP 34
            5
        )
    END
END
    Size_1_A_fn [ 0 ]
    BEGIN
        MOVE TEMP 41
        BEGIN
            MOVE TEMP 43 HALLOCATE 4
            MOVE TEMP 44 HALLOCATE 8
            HSTORE TEMP 44 0 Size_4_Test_foo
            HSTORE TEMP 44 4 Size_4_Test_bar
            MOVE TEMP 45 4
            L2
            CJUMP LT TEMP 45 4 L3
            HSTORE PLUS TEMP 43 TEMP 45 0 0
            MOVE TEMP 45 PLUS TEMP 45 4
            JUMP L2
            L3
            HSTORE TEMP 43 0 TEMP 44
            RETURN TEMP 43
        END
        RETURN TEMP 41
    END
    Size_4_Test_foo [ 1 ]
    BEGIN
        MOVE TEMP 33
            BEGIN
                MOVE TEMP 47 HALLOCATE 4
                MOVE TEMP 48 HALLOCATE 4
                HSTORE TEMP 48 0 Size_1_A_fn
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
        MOVE TEMP 32
            BEGIN
                MOVE TEMP 50
                    BEGIN
                        RETURN TEMP 33
                    END
                HLOAD TEMP 51 TEMP 50 0
                HLOAD TEMP 52 TEMP 51 0
                RETURN
                CALL TEMP 52
                (
                    TEMP 50
                )
            END
        MOVE TEMP 31
            BEGIN
                MOVE TEMP 53
                    BEGIN
                        RETURN TEMP 32
                    END
                HLOAD TEMP 54 TEMP 53 0
                HLOAD TEMP 55 TEMP 54 4
                RETURN
                CALL TEMP 55
                (
                    TEMP 53
                )
            END
        MOVE TEMP 56
        33
        RETURN TEMP 56
    END
    Size_4_Test_bar [ 0 ]
    BEGIN
        MOVE TEMP 57
        0
        RETURN TEMP 57
    END
