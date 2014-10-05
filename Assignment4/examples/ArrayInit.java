MAIN
    PRINT 
    BEGIN
        MOVE TEMP 34
            BEGIN
                MOVE TEMP 36 HALLOCATE 4
                MOVE TEMP 37 HALLOCATE 4
                HSTORE TEMP 37 0 Size_4_Test_foo
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
    Size_4_Test_foo [ 1 ]
    BEGIN
        MOVE TEMP 33
            BEGIN
            MOVE TEMP 42
            BEGIN
                RETURN TEMP 1
            END
                MOVE TEMP 43 HALLOCATE TIMES 4 PLUS 1 TEMP 42
                HSTORE TEMP 43 0 TEMP 42
                MOVE TEMP 44 4
                L2
                CJUMP LT TEMP 44 TIMES 4 PLUS 1 TEMP 42 L3
                HSTORE PLUS TEMP 43 TEMP 44 0 0
                MOVE TEMP 44 PLUS TEMP 44 4
                JUMP L2
                L3 NOOP
                RETURN TEMP 43
            END
        MOVE TEMP 32
            BEGIN
            MOVE TEMP 46
            5
                MOVE TEMP 47 HALLOCATE TIMES 4 PLUS 1 TEMP 46
                HSTORE TEMP 47 0 TEMP 46
                MOVE TEMP 48 4
                L4
                CJUMP LT TEMP 48 TIMES 4 PLUS 1 TEMP 46 L5
                HSTORE PLUS TEMP 47 TEMP 48 0 0
                MOVE TEMP 48 PLUS TEMP 48 4
                JUMP L4
                L5 NOOP
                RETURN TEMP 47
            END
        MOVE TEMP 31
            BEGIN
            MOVE TEMP 50
            TIMES
                BEGIN
                    RETURN TEMP 1
                END
                5
                MOVE TEMP 51 HALLOCATE TIMES 4 PLUS 1 TEMP 50
                HSTORE TEMP 51 0 TEMP 50
                MOVE TEMP 52 4
                L6
                CJUMP LT TEMP 52 TIMES 4 PLUS 1 TEMP 50 L7
                HSTORE PLUS TEMP 51 TEMP 52 0 0
                MOVE TEMP 52 PLUS TEMP 52 4
                JUMP L6
                L7 NOOP
                RETURN TEMP 51
            END
        MOVE TEMP 31
            BEGIN
                RETURN TEMP 33
            END
        MOVE TEMP 53
        5
        RETURN TEMP 53
    END
