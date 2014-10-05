MAIN
    PRINT 
    BEGIN
        MOVE TEMP 32
            BEGIN
                MOVE TEMP 34 HALLOCATE 4
                MOVE TEMP 35 HALLOCATE 4
                HSTORE TEMP 35 0 Size_3_Fac_ComputeFac
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
            10
        )
    END
END
    Size_3_Fac_ComputeFac [ 1 ]
    BEGIN
        CJUMP
            LT
                BEGIN
                    RETURN TEMP 1
                END
                1
            L2
            MOVE TEMP 31
                1
            JUMP L3
            L2 NOOP
            MOVE TEMP 31
                TIMES
                    BEGIN
                        RETURN TEMP 1
                    END
                    BEGIN
                        MOVE TEMP 39
                            TEMP 0
                        HLOAD TEMP 40 TEMP 39 0
                        HLOAD TEMP 41 TEMP 40 0
                        RETURN
                        CALL TEMP 41
                        (
                            TEMP 39
                            MINUS
                                BEGIN
                                    RETURN TEMP 1
                                END
                                1
                        )
                    END
            L3
            NOOP
        MOVE TEMP 42
        BEGIN
            RETURN TEMP 31
        END
        RETURN TEMP 42
    END
