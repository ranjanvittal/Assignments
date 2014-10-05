MAIN
    PRINT 
    BEGIN
        MOVE TEMP 33
            BEGIN
                MOVE TEMP 35 HALLOCATE 4
                MOVE TEMP 36 HALLOCATE 4
                HSTORE TEMP 36 0 Size_4_Test_foo
                MOVE TEMP 37 4
                L0
                CJUMP LT TEMP 37 4 L1
                HSTORE PLUS TEMP 35 TEMP 37 0 0
                MOVE TEMP 37 PLUS TEMP 37 4
                JUMP L0
                L1
                HSTORE TEMP 35 0 TEMP 36
                RETURN TEMP 35
            END
        HLOAD TEMP 38 TEMP 33 0
        HLOAD TEMP 39 TEMP 38 0
        RETURN
        CALL TEMP 39
        (
            TEMP 33
            2
            4
        )
    END
END
    Size_4_Test_foo [ 2 ]
    BEGIN
        MOVE TEMP 31
            BEGIN
            MOVE TEMP 41
            BEGIN
                RETURN TEMP 2
            END
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
        MOVE TEMP 32
            BEGIN
                MOVE TEMP 44
                BEGIN
                    RETURN TEMP 31
                END
                MOVE TEMP 45
                3
                MOVE TEMP 45 TIMES 4 TEMP 45
                HLOAD TEMP 47 TEMP 44 0
                CJUMP MINUS 1 LT TEMP 45 TIMES 4 TEMP 47 L4
                    ERROR
                L4
                NOOP
                MOVE TEMP 44 PLUS 4 PLUS TEMP 45 TEMP 44
                HLOAD TEMP 46 TEMP 44 0
                RETURN TEMP 46
            END
        MOVE TEMP 32
            BEGIN
                MOVE TEMP 48
                BEGIN
                    RETURN TEMP 31
                END
                MOVE TEMP 49
                BEGIN
                    RETURN TEMP 1
                END
                MOVE TEMP 49 TIMES 4 TEMP 49
                HLOAD TEMP 51 TEMP 48 0
                CJUMP MINUS 1 LT TEMP 49 TIMES 4 TEMP 51 L5
                    ERROR
                L5
                NOOP
                MOVE TEMP 48 PLUS 4 PLUS TEMP 49 TEMP 48
                HLOAD TEMP 50 TEMP 48 0
                RETURN TEMP 50
            END
        MOVE TEMP 52
        BEGIN
            RETURN TEMP 32
        END
        RETURN TEMP 52
    END
