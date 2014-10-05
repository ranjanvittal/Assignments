MAIN
    PRINT 
    BEGIN
        MOVE TEMP 34
            BEGIN
                MOVE TEMP 36 HALLOCATE 4
                MOVE TEMP 37 HALLOCATE 4
                HSTORE TEMP 37 0 Size_4_Test_bar
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
            BEGIN
                MOVE TEMP 42 HALLOCATE 4
                MOVE TEMP 43 HALLOCATE 4
                HSTORE TEMP 43 0 Size_4_Test_bar
                MOVE TEMP 44 4
                L2
                CJUMP LT TEMP 44 4 L3
                HSTORE PLUS TEMP 42 TEMP 44 0 0
                MOVE TEMP 44 PLUS TEMP 44 4
                JUMP L2
                L3
                HSTORE TEMP 42 0 TEMP 43
                RETURN TEMP 42
            END
        )
    END
END
    Size_4_Test_bar [ 1 ]
    BEGIN
        MOVE TEMP 33
            8
        MOVE TEMP 31
            45
        MOVE TEMP 32
            1
        CJUMP
            TIMES
                TIMES
                    LT
                        BEGIN
                            RETURN TEMP 33
                        END
                        BEGIN
                            RETURN TEMP 31
                        END
                    LT
                        BEGIN
                            RETURN TEMP 31
                        END
                        BEGIN
                            RETURN TEMP 33
                        END
                BEGIN
                    RETURN TEMP 32
                END
            L4
            MOVE TEMP 32
                0
            JUMP L5
            L4 NOOP
            MOVE TEMP 32
                1
            L5
            NOOP
        MOVE TEMP 45
        0
        RETURN TEMP 45
    END
