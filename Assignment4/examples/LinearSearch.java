MAIN
    PRINT 
    BEGIN
        MOVE TEMP 44
            BEGIN
                MOVE TEMP 46 HALLOCATE 12
                MOVE TEMP 47 HALLOCATE 16
                HSTORE TEMP 47 0 Size_2_LS_Search
                HSTORE TEMP 47 4 Size_2_LS_Start
                HSTORE TEMP 47 8 Size_2_LS_Init
                HSTORE TEMP 47 12 Size_2_LS_Print
                MOVE TEMP 48 4
                L0
                CJUMP LT TEMP 48 12 L1
                HSTORE PLUS TEMP 46 TEMP 48 0 0
                MOVE TEMP 48 PLUS TEMP 48 4
                JUMP L0
                L1
                HSTORE TEMP 46 0 TEMP 47
                RETURN TEMP 46
            END
        HLOAD TEMP 49 TEMP 44 0
        HLOAD TEMP 50 TEMP 49 4
        RETURN
        CALL TEMP 50
        (
            TEMP 44
            10
        )
    END
END
    Size_2_LS_Start [ 1 ]
    BEGIN
        MOVE TEMP 38
            BEGIN
                MOVE TEMP 51
                    TEMP 0
                HLOAD TEMP 52 TEMP 51 0
                HLOAD TEMP 53 TEMP 52 8
                RETURN
                CALL TEMP 53
                (
                    TEMP 51
                    BEGIN
                        RETURN TEMP 1
                    END
                )
            END
        MOVE TEMP 37
            BEGIN
                MOVE TEMP 54
                    TEMP 0
                HLOAD TEMP 55 TEMP 54 0
                HLOAD TEMP 56 TEMP 55 12
                RETURN
                CALL TEMP 56
                (
                    TEMP 54
                )
            END
        PRINT 
        9999
        PRINT 
        BEGIN
            MOVE TEMP 57
                TEMP 0
            HLOAD TEMP 58 TEMP 57 0
            HLOAD TEMP 59 TEMP 58 0
            RETURN
            CALL TEMP 59
            (
                TEMP 57
                8
            )
        END
        PRINT 
        BEGIN
            MOVE TEMP 60
                TEMP 0
            HLOAD TEMP 61 TEMP 60 0
            HLOAD TEMP 62 TEMP 61 0
            RETURN
            CALL TEMP 62
            (
                TEMP 60
                12
            )
        END
        PRINT 
        BEGIN
            MOVE TEMP 63
                TEMP 0
            HLOAD TEMP 64 TEMP 63 0
            HLOAD TEMP 65 TEMP 64 0
            RETURN
            CALL TEMP 65
            (
                TEMP 63
                17
            )
        END
        PRINT 
        BEGIN
            MOVE TEMP 66
                TEMP 0
            HLOAD TEMP 67 TEMP 66 0
            HLOAD TEMP 68 TEMP 67 0
            RETURN
            CALL TEMP 68
            (
                TEMP 66
                50
            )
        END
        MOVE TEMP 69
        55
        RETURN TEMP 69
    END
    Size_2_LS_Print [ 0 ]
    BEGIN
        MOVE TEMP 43
            1
        L2
         CJUMP 
        LT
            BEGIN
                RETURN TEMP 43
            END
            BEGIN
                HLOAD TEMP 70 TEMP 0 8
                RETURN TEMP 70
            END
        L3
        PRINT 
        BEGIN
            MOVE TEMP 71
            BEGIN
                HLOAD TEMP 75 TEMP 0 4
                RETURN TEMP 75
            END
            MOVE TEMP 72
            BEGIN
                RETURN TEMP 43
            END
            MOVE TEMP 72 TIMES 4 TEMP 72
            HLOAD TEMP 74 TEMP 71 0
            CJUMP MINUS 1 LT TEMP 72 TIMES 4 TEMP 74 L4
                ERROR
            L4
            NOOP
            MOVE TEMP 71 PLUS 4 PLUS TEMP 72 TEMP 71
            HLOAD TEMP 73 TEMP 71 0
            RETURN TEMP 73
        END
        MOVE TEMP 43
            PLUS
                BEGIN
                    RETURN TEMP 43
                END
                1
        JUMP L2
        L3
        NOOP
        MOVE TEMP 76
        0
        RETURN TEMP 76
    END
    Size_2_LS_Search [ 1 ]
    BEGIN
        MOVE TEMP 36
            1
        MOVE TEMP 32
            0
        MOVE TEMP 33
            0
        L5
         CJUMP 
        LT
            BEGIN
                RETURN TEMP 36
            END
            BEGIN
                HLOAD TEMP 77 TEMP 0 8
                RETURN TEMP 77
            END
        L6
        MOVE TEMP 35
            BEGIN
                MOVE TEMP 78
                BEGIN
                    HLOAD TEMP 82 TEMP 0 4
                    RETURN TEMP 82
                END
                MOVE TEMP 79
                BEGIN
                    RETURN TEMP 36
                END
                MOVE TEMP 79 TIMES 4 TEMP 79
                HLOAD TEMP 81 TEMP 78 0
                CJUMP MINUS 1 LT TEMP 79 TIMES 4 TEMP 81 L7
                    ERROR
                L7
                NOOP
                MOVE TEMP 78 PLUS 4 PLUS TEMP 79 TEMP 78
                HLOAD TEMP 80 TEMP 78 0
                RETURN TEMP 80
            END
        MOVE TEMP 34
            PLUS
                BEGIN
                    RETURN TEMP 1
                END
                1
        CJUMP
            LT
                BEGIN
                    RETURN TEMP 35
                END
                BEGIN
                    RETURN TEMP 1
                END
            L8
            MOVE TEMP 31
                0
            JUMP L9
            L8 NOOP
            CJUMP
            MINUS 1 
                LT
                    BEGIN
                        RETURN TEMP 35
                    END
                    BEGIN
                        RETURN TEMP 34
                    END
                L10
                MOVE TEMP 31
                    0
                JUMP L11
                L10 NOOP
                MOVE TEMP 32
                    1
                MOVE TEMP 33
                    1
                MOVE TEMP 36
                    BEGIN
                        HLOAD TEMP 84 TEMP 0 8
                        RETURN TEMP 84
                    END
                L11
                NOOP
            L9
            NOOP
        MOVE TEMP 36
            PLUS
                BEGIN
                    RETURN TEMP 36
                END
                1
        JUMP L5
        L6
        NOOP
        MOVE TEMP 85
        BEGIN
            RETURN TEMP 33
        END
        RETURN TEMP 85
    END
    Size_2_LS_Init [ 1 ]
    BEGIN
        HSTORE TEMP 0 8
            BEGIN
                RETURN TEMP 1
            END
        HSTORE TEMP 0 4
            BEGIN
            MOVE TEMP 87
            BEGIN
                RETURN TEMP 1
            END
                MOVE TEMP 88 HALLOCATE TIMES 4 PLUS 1 TEMP 87
                HSTORE TEMP 88 0 TEMP 87
                MOVE TEMP 89 4
                L12
                CJUMP LT TEMP 89 TIMES 4 PLUS 1 TEMP 87 L13
                HSTORE PLUS TEMP 88 TEMP 89 0 0
                MOVE TEMP 89 PLUS TEMP 89 4
                JUMP L12
                L13 NOOP
                RETURN TEMP 88
            END
        MOVE TEMP 41
            1
        MOVE TEMP 42
            PLUS
                BEGIN
                    HLOAD TEMP 90 TEMP 0 8
                    RETURN TEMP 90
                END
                1
        L14
         CJUMP 
        LT
            BEGIN
                RETURN TEMP 41
            END
            BEGIN
                HLOAD TEMP 91 TEMP 0 8
                RETURN TEMP 91
            END
        L15
        MOVE TEMP 40
            TIMES
                2
                BEGIN
                    RETURN TEMP 41
                END
        MOVE TEMP 39
            MINUS
                BEGIN
                    RETURN TEMP 42
                END
                3
        MOVE TEMP 92
            BEGIN
                RETURN TEMP 41
            END
        HLOAD TEMP 93TEMP 0 4
        HLOAD TEMP 94 TEMP 93 0
        CJUMP MINUS 1 LT TEMP 92 TEMP 94 L16
            ERROR
        L16
        HSTORE PLUS TEMP 93 TIMES 4 PLUS 1 TEMP 92 0
        PLUS
            BEGIN
                RETURN TEMP 40
            END
            BEGIN
                RETURN TEMP 39
            END
        MOVE TEMP 41
            PLUS
                BEGIN
                    RETURN TEMP 41
                END
                1
        MOVE TEMP 42
            MINUS
                BEGIN
                    RETURN TEMP 42
                END
                1
        JUMP L14
        L15
        NOOP
        MOVE TEMP 95
        0
        RETURN TEMP 95
    END
