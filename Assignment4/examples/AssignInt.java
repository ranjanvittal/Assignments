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
            10
            11
        )
    END
END
    Size_4_Test_foo [ 2 ]
    BEGIN
        MOVE TEMP 32
            10
        MOVE TEMP 31
            7
        MOVE TEMP 1
            PLUS
                BEGIN
                    RETURN TEMP 32
                END
                BEGIN
                    RETURN TEMP 31
                END
        MOVE TEMP 40
        BEGIN
            RETURN TEMP 1
        END
        RETURN TEMP 40
    END
