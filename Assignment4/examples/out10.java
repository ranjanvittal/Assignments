MAIN
    PRINT 
    BEGIN
        MOVE TEMP 33
            BEGIN
                MOVE TEMP 35 HALLOCATE 24
                MOVE TEMP 36 HALLOCATE 20
                HSTORE TEMP 36 0 Size_3_Fac_tellyNum
                HSTORE TEMP 36 4 Size_4_Fac1_ComputeFac
                HSTORE TEMP 36 8 Size_3_Fac_underLyingC
                HSTORE TEMP 36 12 Size_4_Fac1_Start
                HSTORE TEMP 36 16 Size_4_Fac1_tellNum
                MOVE TEMP 37 4
                L0
                CJUMP LT TEMP 37 24 L1
                HSTORE PLUS TEMP 35 TEMP 37 0 0
                MOVE TEMP 37 PLUS TEMP 37 4
                JUMP L0
                L1
                HSTORE TEMP 35 0 TEMP 36
                RETURN TEMP 35
            END
        HLOAD TEMP 38 TEMP 33 0
        HLOAD TEMP 39 TEMP 38 12
        RETURN
        CALL TEMP 39
        (
            TEMP 33
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
                        MOVE TEMP 40
                            TEMP 0
                        HLOAD TEMP 41 TEMP 40 0
                        HLOAD TEMP 42 TEMP 41 4
                        RETURN
                        CALL TEMP 42
                        (
                            TEMP 40
                            MINUS
                                BEGIN
                                    RETURN TEMP 1
                                END
                                2
                        )
                    END
            L3
            NOOP
        MOVE TEMP 43
        BEGIN
            RETURN TEMP 31
        END
        RETURN TEMP 43
    END
    Size_3_Fac_tellyNum [ 1 ]
    BEGIN
        HSTORE TEMP 0 8
            BEGIN
            MOVE TEMP 45
            BEGIN
                RETURN TEMP 1
            END
                MOVE TEMP 46 HALLOCATE TIMES 4 PLUS 1 TEMP 45
                HSTORE TEMP 46 0 TEMP 45
                MOVE TEMP 47 4
                L4
                CJUMP LT TEMP 47 TIMES 4 PLUS 1 TEMP 45 L5
                HSTORE PLUS TEMP 46 TEMP 47 0 0
                MOVE TEMP 47 PLUS TEMP 47 4
                JUMP L4
                L5 NOOP
                RETURN TEMP 46
            END
        MOVE TEMP 48
            MINUS
                BEGIN
                    RETURN TEMP 1
                END
                1
        HLOAD TEMP 49TEMP 0 8
        HLOAD TEMP 50 TEMP 49 0
        CJUMP MINUS 1 LT TEMP 48 TEMP 50 L6
            ERROR
        L6
        HSTORE PLUS TEMP 49 TIMES 4 PLUS 1 TEMP 48 0
        45
        MOVE TEMP 51
        BEGIN
            MOVE TEMP 52
            BEGIN
                HLOAD TEMP 56 TEMP 0 8
                RETURN TEMP 56
            END
            MOVE TEMP 53
            MINUS
                BEGIN
                    RETURN TEMP 1
                END
                1
            MOVE TEMP 53 TIMES 4 TEMP 53
            HLOAD TEMP 55 TEMP 52 0
            CJUMP MINUS 1 LT TEMP 53 TIMES 4 TEMP 55 L7
                ERROR
            L7
            NOOP
            MOVE TEMP 52 PLUS 4 PLUS TEMP 53 TEMP 52
            HLOAD TEMP 54 TEMP 52 0
            RETURN TEMP 54
        END
        RETURN TEMP 51
    END
    Size_3_Fac_underLyingC [ 0 ]
    BEGIN
        MOVE TEMP 57
        BEGIN
            MOVE TEMP 58
            BEGIN
                HLOAD TEMP 62 TEMP 0 8
                RETURN TEMP 62
            END
            MOVE TEMP 59
            22
            MOVE TEMP 59 TIMES 4 TEMP 59
            HLOAD TEMP 61 TEMP 58 0
            CJUMP MINUS 1 LT TEMP 59 TIMES 4 TEMP 61 L8
                ERROR
            L8
            NOOP
            MOVE TEMP 58 PLUS 4 PLUS TEMP 59 TEMP 58
            HLOAD TEMP 60 TEMP 58 0
            RETURN TEMP 60
        END
        RETURN TEMP 57
    END
    Size_4_Fac1_Start [ 0 ]
    BEGIN
        HSTORE TEMP 0 12
            BEGIN
                MOVE TEMP 63
                    TEMP 0
                HLOAD TEMP 64 TEMP 63 0
                HLOAD TEMP 65 TEMP 64 16
                RETURN
                CALL TEMP 65
                (
                    TEMP 63
                    23
                )
            END
        PRINT 
        BEGIN
            MOVE TEMP 66
                TEMP 0
            HLOAD TEMP 67 TEMP 66 0
            HLOAD TEMP 68 TEMP 67 8
            RETURN
            CALL TEMP 68
            (
                TEMP 66
            )
        END
        PRINT 
        BEGIN
            MOVE TEMP 69
            BEGIN
                HLOAD TEMP 73 TEMP 0 16
                RETURN TEMP 73
            END
            MOVE TEMP 70
            22
            MOVE TEMP 70 TIMES 4 TEMP 70
            HLOAD TEMP 72 TEMP 69 0
            CJUMP MINUS 1 LT TEMP 70 TIMES 4 TEMP 72 L9
                ERROR
            L9
            NOOP
            MOVE TEMP 69 PLUS 4 PLUS TEMP 70 TEMP 69
            HLOAD TEMP 71 TEMP 69 0
            RETURN TEMP 71
        END
        MOVE TEMP 74
        0
        RETURN TEMP 74
    END
    Size_4_Fac1_ComputeFac [ 1 ]
    BEGIN
        CJUMP
            LT
                BEGIN
                    RETURN TEMP 1
                END
                1
            L10
            MOVE TEMP 32
                1
            JUMP L11
            L10 NOOP
            HSTORE TEMP 0 20
                TEMP 0
            MOVE TEMP 32
                TIMES
                    BEGIN
                        RETURN TEMP 1
                    END
                    BEGIN
                        MOVE TEMP 75
                            BEGIN
                                HLOAD TEMP 76 TEMP 0 20
                                RETURN TEMP 76
                            END
                        HLOAD TEMP 77 TEMP 75 0
                        HLOAD TEMP 78 TEMP 77 4
                        RETURN
                        CALL TEMP 78
                        (
                            TEMP 75
                            MINUS
                                BEGIN
                                    RETURN TEMP 1
                                END
                                1
                        )
                    END
            L11
            NOOP
        MOVE TEMP 79
        BEGIN
            RETURN TEMP 32
        END
        RETURN TEMP 79
    END
    Size_4_Fac1_tellNum [ 1 ]
    BEGIN
        HSTORE TEMP 0 16
            BEGIN
            MOVE TEMP 81
            BEGIN
                RETURN TEMP 1
            END
                MOVE TEMP 82 HALLOCATE TIMES 4 PLUS 1 TEMP 81
                HSTORE TEMP 82 0 TEMP 81
                MOVE TEMP 83 4
                L12
                CJUMP LT TEMP 83 TIMES 4 PLUS 1 TEMP 81 L13
                HSTORE PLUS TEMP 82 TEMP 83 0 0
                MOVE TEMP 83 PLUS TEMP 83 4
                JUMP L12
                L13 NOOP
                RETURN TEMP 82
            END
        MOVE TEMP 84
            MINUS
                BEGIN
                    RETURN TEMP 1
                END
                1
        HLOAD TEMP 85TEMP 0 16
        HLOAD TEMP 86 TEMP 85 0
        CJUMP MINUS 1 LT TEMP 84 TEMP 86 L14
            ERROR
        L14
        HSTORE PLUS TEMP 85 TIMES 4 PLUS 1 TEMP 84 0
        33
        HSTORE TEMP 0 12
            BEGIN
                MOVE TEMP 87
                    TEMP 0
                HLOAD TEMP 88 TEMP 87 0
                HLOAD TEMP 89 TEMP 88 0
                RETURN
                CALL TEMP 89
                (
                    TEMP 87
                    BEGIN
                        RETURN TEMP 1
                    END
                )
            END
        MOVE TEMP 90
        0
        RETURN TEMP 90
    END
