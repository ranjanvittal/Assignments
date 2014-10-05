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
            1
            11
        )
    END
END
    Size_4_Test_foo [ 2 ]
    BEGIN
        MOVE TEMP 32
            90
        MOVE TEMP 33
            8
        MOVE TEMP 31
            0
        MOVE TEMP 31
            TIMES
                BEGIN
                    RETURN TEMP 1
                END
                TIMES
                    LT
                        BEGIN
                            RETURN TEMP 33
                        END
                        TIMES
                            BEGIN
                                RETURN TEMP 32
                            END
                            BEGIN
                                RETURN TEMP 33
                            END
                    BEGIN
                        RETURN TEMP 1
                    END
        MOVE TEMP 41
        BEGIN
            RETURN TEMP 2
        END
        RETURN TEMP 41
    END
