MAIN
    PRINT 
    BEGIN
        MOVE TEMP 35
            BEGIN
                MOVE TEMP 37 HALLOCATE 4
                MOVE TEMP 38 HALLOCATE 12
                HSTORE TEMP 38 0 Size_4_Test_f1
                HSTORE TEMP 38 4 Size_4_Test_bar
                HSTORE TEMP 38 8 Size_4_Test_f2
                MOVE TEMP 39 4
                L0
                CJUMP LT TEMP 39 4 L1
                HSTORE PLUS TEMP 37 TEMP 39 0 0
                MOVE TEMP 39 PLUS TEMP 39 4
                JUMP L0
                L1
                HSTORE TEMP 37 0 TEMP 38
                RETURN TEMP 37
            END
        HLOAD TEMP 40 TEMP 35 0
        HLOAD TEMP 41 TEMP 40 4
        RETURN
        CALL TEMP 41
        (
            TEMP 35
            1
            2
            3
        )
    END
END
    Size_4_Test_bar [ 3 ]
    BEGIN
        MOVE TEMP 33
            TEMP 0
        MOVE TEMP 31
            BEGIN
            MOVE TEMP 43
            BEGIN
                RETURN TEMP 3
            END
                MOVE TEMP 44 HALLOCATE TIMES 4 PLUS 1 TEMP 43
                HSTORE TEMP 44 0 TEMP 43
                MOVE TEMP 45 4
                L2
                CJUMP LT TEMP 45 TIMES 4 PLUS 1 TEMP 43 L3
                HSTORE PLUS TEMP 44 TEMP 45 0 0
                MOVE TEMP 45 PLUS TEMP 45 4
                JUMP L2
                L3 NOOP
                RETURN TEMP 44
            END
        MOVE TEMP 34
            BEGIN
                MOVE TEMP 46
                    BEGIN
                        RETURN TEMP 33
                    END
                HLOAD TEMP 47 TEMP 46 0
                HLOAD TEMP 48 TEMP 47 0
                RETURN
                CALL TEMP 48
                (
                    TEMP 46
                    BEGIN
                        RETURN TEMP 1
                    END
                    BEGIN
                        RETURN TEMP 2
                    END
                )
            END
        MOVE TEMP 32
            BEGIN
                MOVE TEMP 49
                    TEMP 0
                HLOAD TEMP 50 TEMP 49 0
                HLOAD TEMP 51 TEMP 50 8
                RETURN
                CALL TEMP 51
                (
                    TEMP 49
                )
            END
        MOVE TEMP 34
            BEGIN
                MOVE TEMP 52
                    TEMP 0
                HLOAD TEMP 53 TEMP 52 0
                HLOAD TEMP 54 TEMP 53 0
                RETURN
                CALL TEMP 54
                (
                    TEMP 52
                    BEGIN
                        RETURN TEMP 1
                    END
                    BEGIN
                        RETURN TEMP 2
                    END
                )
            END
        MOVE TEMP 55
        1
        RETURN TEMP 55
    END
    Size_4_Test_f1 [ 2 ]
    BEGIN
        MOVE TEMP 56
        0
        RETURN TEMP 56
    END
    Size_4_Test_f2 [ 0 ]
    BEGIN
        MOVE TEMP 57
        1
        RETURN TEMP 57
    END
