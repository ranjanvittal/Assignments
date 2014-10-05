MAIN
    PRINT 
    BEGIN
        MOVE TEMP 32
            BEGIN
                MOVE TEMP 34 HALLOCATE 4
                MOVE TEMP 35 HALLOCATE 8
                HSTORE TEMP 35 0 Size_3_MT4_Start
                HSTORE TEMP 35 4 Size_3_MT4_Change
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
            1
            2
            3
            4
            5
            6
        )
    END
END
    Size_3_MT4_Start [ 6 ]
    BEGIN
        PRINT 
        BEGIN
            RETURN TEMP 1
        END
        PRINT 
        BEGIN
            RETURN TEMP 2
        END
        PRINT 
        BEGIN
            RETURN TEMP 3
        END
        PRINT 
        BEGIN
            RETURN TEMP 4
        END
        PRINT 
        BEGIN
            RETURN TEMP 5
        END
        PRINT 
        BEGIN
            RETURN TEMP 6
        END
        MOVE TEMP 31
            BEGIN
                MOVE TEMP 39
                    TEMP 0
                HLOAD TEMP 40 TEMP 39 0
                HLOAD TEMP 41 TEMP 40 4
                RETURN
                CALL TEMP 41
                (
                    TEMP 39
                    BEGIN
                        RETURN TEMP 6
                    END
                    BEGIN
                        RETURN TEMP 5
                    END
                    BEGIN
                        RETURN TEMP 4
                    END
                    BEGIN
                        RETURN TEMP 3
                    END
                    BEGIN
                        RETURN TEMP 2
                    END
                    BEGIN
                        RETURN TEMP 1
                    END
                )
            END
        MOVE TEMP 42
        BEGIN
            RETURN TEMP 31
        END
        RETURN TEMP 42
    END
    Size_3_MT4_Change [ 6 ]
    BEGIN
        PRINT 
        BEGIN
            RETURN TEMP 1
        END
        PRINT 
        BEGIN
            RETURN TEMP 2
        END
        PRINT 
        BEGIN
            RETURN TEMP 3
        END
        PRINT 
        BEGIN
            RETURN TEMP 4
        END
        PRINT 
        BEGIN
            RETURN TEMP 5
        END
        PRINT 
        BEGIN
            RETURN TEMP 6
        END
        MOVE TEMP 43
        0
        RETURN TEMP 43
    END
