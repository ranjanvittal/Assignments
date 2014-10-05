MAIN
    PRINT 
    BEGIN
        MOVE TEMP 50
            BEGIN
                MOVE TEMP 52 HALLOCATE 12
                MOVE TEMP 53 HALLOCATE 24
                HSTORE TEMP 53 0 Size_2_BS_Search
                HSTORE TEMP 53 4 Size_2_BS_Start
                HSTORE TEMP 53 8 Size_2_BS_Init
                HSTORE TEMP 53 12 Size_2_BS_Compare
                HSTORE TEMP 53 16 Size_2_BS_Print
                HSTORE TEMP 53 20 Size_2_BS_Div
                MOVE TEMP 54 4
                L0
                CJUMP LT TEMP 54 12 L1
                HSTORE PLUS TEMP 52 TEMP 54 0 0
                MOVE TEMP 54 PLUS TEMP 54 4
                JUMP L0
                L1
                HSTORE TEMP 52 0 TEMP 53
                RETURN TEMP 52
            END
        HLOAD TEMP 55 TEMP 50 0
        HLOAD TEMP 56 TEMP 55 4
        RETURN
        CALL TEMP 56
        (
            TEMP 50
            20
        )
    END
END
    Size_2_BS_Start [ 1 ]
    BEGIN
        MOVE TEMP 39
            BEGIN
                MOVE TEMP 57
                    TEMP 0
                HLOAD TEMP 58 TEMP 57 0
                HLOAD TEMP 59 TEMP 58 8
                RETURN
                CALL TEMP 59
                (
                    TEMP 57
                    BEGIN
                        RETURN TEMP 1
                    END
                )
            END
        MOVE TEMP 38
            BEGIN
                MOVE TEMP 60
                    TEMP 0
                HLOAD TEMP 61 TEMP 60 0
                HLOAD TEMP 62 TEMP 61 16
                RETURN
                CALL TEMP 62
                (
                    TEMP 60
                )
            END
        CJUMP
            BEGIN
                MOVE TEMP 63
                    TEMP 0
                HLOAD TEMP 64 TEMP 63 0
                HLOAD TEMP 65 TEMP 64 0
                RETURN
                CALL TEMP 65
                (
                    TEMP 63
                    8
                )
            END
            L2
            PRINT 
            1
            JUMP L3
            L2 NOOP
            PRINT 
            0
            L3
            NOOP
        CJUMP
            BEGIN
                MOVE TEMP 66
                    TEMP 0
                HLOAD TEMP 67 TEMP 66 0
                HLOAD TEMP 68 TEMP 67 0
                RETURN
                CALL TEMP 68
                (
                    TEMP 66
                    19
                )
            END
            L4
            PRINT 
            1
            JUMP L5
            L4 NOOP
            PRINT 
            0
            L5
            NOOP
        CJUMP
            BEGIN
                MOVE TEMP 69
                    TEMP 0
                HLOAD TEMP 70 TEMP 69 0
                HLOAD TEMP 71 TEMP 70 0
                RETURN
                CALL TEMP 71
                (
                    TEMP 69
                    20
                )
            END
            L6
            PRINT 
            1
            JUMP L7
            L6 NOOP
            PRINT 
            0
            L7
            NOOP
        CJUMP
            BEGIN
                MOVE TEMP 72
                    TEMP 0
                HLOAD TEMP 73 TEMP 72 0
                HLOAD TEMP 74 TEMP 73 0
                RETURN
                CALL TEMP 74
                (
                    TEMP 72
                    21
                )
            END
            L8
            PRINT 
            1
            JUMP L9
            L8 NOOP
            PRINT 
            0
            L9
            NOOP
        CJUMP
            BEGIN
                MOVE TEMP 75
                    TEMP 0
                HLOAD TEMP 76 TEMP 75 0
                HLOAD TEMP 77 TEMP 76 0
                RETURN
                CALL TEMP 77
                (
                    TEMP 75
                    37
                )
            END
            L10
            PRINT 
            1
            JUMP L11
            L10 NOOP
            PRINT 
            0
            L11
            NOOP
        CJUMP
            BEGIN
                MOVE TEMP 78
                    TEMP 0
                HLOAD TEMP 79 TEMP 78 0
                HLOAD TEMP 80 TEMP 79 0
                RETURN
                CALL TEMP 80
                (
                    TEMP 78
                    38
                )
            END
            L12
            PRINT 
            1
            JUMP L13
            L12 NOOP
            PRINT 
            0
            L13
            NOOP
        CJUMP
            BEGIN
                MOVE TEMP 81
                    TEMP 0
                HLOAD TEMP 82 TEMP 81 0
                HLOAD TEMP 83 TEMP 82 0
                RETURN
                CALL TEMP 83
                (
                    TEMP 81
                    39
                )
            END
            L14
            PRINT 
            1
            JUMP L15
            L14 NOOP
            PRINT 
            0
            L15
            NOOP
        CJUMP
            BEGIN
                MOVE TEMP 84
                    TEMP 0
                HLOAD TEMP 85 TEMP 84 0
                HLOAD TEMP 86 TEMP 85 0
                RETURN
                CALL TEMP 86
                (
                    TEMP 84
                    50
                )
            END
            L16
            PRINT 
            1
            JUMP L17
            L16 NOOP
            PRINT 
            0
            L17
            NOOP
        MOVE TEMP 87
        999
        RETURN TEMP 87
    END
    Size_2_BS_Search [ 1 ]
    BEGIN
        MOVE TEMP 33
            0
        MOVE TEMP 35
            0
        MOVE TEMP 36
            BEGIN
                MOVE TEMP 88
                BEGIN
                    HLOAD TEMP 89 TEMP 0 4
                    RETURN TEMP 89
                END
                HLOAD TEMP 90 TEMP 88 0
                RETURN TEMP 90
                END
            MOVE TEMP 36
                MINUS
                    BEGIN
                        RETURN TEMP 36
                    END
                    1
            MOVE TEMP 34
                0
            MOVE TEMP 32
                1
            L18
             CJUMP 
            BEGIN
                RETURN TEMP 32
            END
            L19
            MOVE TEMP 37
                PLUS
                    BEGIN
                        RETURN TEMP 34
                    END
                    BEGIN
                        RETURN TEMP 36
                    END
            MOVE TEMP 37
                BEGIN
                    MOVE TEMP 91
                        TEMP 0
                    HLOAD TEMP 92 TEMP 91 0
                    HLOAD TEMP 93 TEMP 92 20
                    RETURN
                    CALL TEMP 93
                    (
                        TEMP 91
                        BEGIN
                            RETURN TEMP 37
                        END
                    )
                END
            MOVE TEMP 33
                BEGIN
                    MOVE TEMP 94
                    BEGIN
                        HLOAD TEMP 98 TEMP 0 4
                        RETURN TEMP 98
                    END
                    MOVE TEMP 95
                    BEGIN
                        RETURN TEMP 37
                    END
                    MOVE TEMP 95 TIMES 4 TEMP 95
                    HLOAD TEMP 97 TEMP 94 0
                    CJUMP MINUS 1 LT TEMP 95 TIMES 4 TEMP 97 L20
                        ERROR
                    L20
                    NOOP
                    MOVE TEMP 94 PLUS 4 PLUS TEMP 95 TEMP 94
                    HLOAD TEMP 96 TEMP 94 0
                    RETURN TEMP 96
                END
            CJUMP
                LT
                    BEGIN
                        RETURN TEMP 1
                    END
                    BEGIN
                        RETURN TEMP 33
                    END
                L21
                MOVE TEMP 36
                    MINUS
                        BEGIN
                            RETURN TEMP 37
                        END
                        1
                JUMP L22
                L21 NOOP
                MOVE TEMP 34
                    PLUS
                        BEGIN
                            RETURN TEMP 37
                        END
                        1
                L22
                NOOP
            CJUMP
                BEGIN
                    MOVE TEMP 99
                        TEMP 0
                    HLOAD TEMP 100 TEMP 99 0
                    HLOAD TEMP 101 TEMP 100 12
                    RETURN
                    CALL TEMP 101
                    (
                        TEMP 99
                        BEGIN
                            RETURN TEMP 33
                        END
                        BEGIN
                            RETURN TEMP 1
                        END
                    )
                END
                L23
                MOVE TEMP 32
                    0
                JUMP L24
                L23 NOOP
                MOVE TEMP 32
                    1
                L24
                NOOP
            CJUMP
                LT
                    BEGIN
                        RETURN TEMP 36
                    END
                    BEGIN
                        RETURN TEMP 34
                    END
                L25
                MOVE TEMP 32
                    0
                JUMP L26
                L25 NOOP
                MOVE TEMP 31
                    0
                L26
                NOOP
            JUMP L18
            L19
            NOOP
            CJUMP
                BEGIN
                    MOVE TEMP 102
                        TEMP 0
                    HLOAD TEMP 103 TEMP 102 0
                    HLOAD TEMP 104 TEMP 103 12
                    RETURN
                    CALL TEMP 104
                    (
                        TEMP 102
                        BEGIN
                            RETURN TEMP 33
                        END
                        BEGIN
                            RETURN TEMP 1
                        END
                    )
                END
                L27
                MOVE TEMP 35
                    1
                JUMP L28
                L27 NOOP
                MOVE TEMP 35
                    0
                L28
                NOOP
            MOVE TEMP 105
            BEGIN
                RETURN TEMP 35
            END
            RETURN TEMP 105
        END
        Size_2_BS_Div [ 1 ]
        BEGIN
            MOVE TEMP 48
                0
            MOVE TEMP 47
                0
            MOVE TEMP 49
                MINUS
                    BEGIN
                        RETURN TEMP 1
                    END
                    1
            L29
             CJUMP 
            LT
                BEGIN
                    RETURN TEMP 47
                END
                BEGIN
                    RETURN TEMP 49
                END
            L30
            MOVE TEMP 48
                PLUS
                    BEGIN
                        RETURN TEMP 48
                    END
                    1
            MOVE TEMP 47
                PLUS
                    BEGIN
                        RETURN TEMP 47
                    END
                    2
            JUMP L29
            L30
            NOOP
            MOVE TEMP 106
            BEGIN
                RETURN TEMP 48
            END
            RETURN TEMP 106
        END
        Size_2_BS_Compare [ 2 ]
        BEGIN
            MOVE TEMP 44
                0
            MOVE TEMP 45
                PLUS
                    BEGIN
                        RETURN TEMP 2
                    END
                    1
            CJUMP
                LT
                    BEGIN
                        RETURN TEMP 1
                    END
                    BEGIN
                        RETURN TEMP 2
                    END
                L31
                MOVE TEMP 44
                    0
                JUMP L32
                L31 NOOP
                CJUMP
                MINUS 1 
                    LT
                        BEGIN
                            RETURN TEMP 1
                        END
                        BEGIN
                            RETURN TEMP 45
                        END
                    L33
                    MOVE TEMP 44
                        0
                    JUMP L34
                    L33 NOOP
                    MOVE TEMP 44
                        1
                    L34
                    NOOP
                L32
                NOOP
            MOVE TEMP 108
            BEGIN
                RETURN TEMP 44
            END
            RETURN TEMP 108
        END
        Size_2_BS_Print [ 0 ]
        BEGIN
            MOVE TEMP 46
                1
            L35
             CJUMP 
            LT
                BEGIN
                    RETURN TEMP 46
                END
                BEGIN
                    HLOAD TEMP 109 TEMP 0 8
                    RETURN TEMP 109
                END
            L36
            PRINT 
            BEGIN
                MOVE TEMP 110
                BEGIN
                    HLOAD TEMP 114 TEMP 0 4
                    RETURN TEMP 114
                END
                MOVE TEMP 111
                BEGIN
                    RETURN TEMP 46
                END
                MOVE TEMP 111 TIMES 4 TEMP 111
                HLOAD TEMP 113 TEMP 110 0
                CJUMP MINUS 1 LT TEMP 111 TIMES 4 TEMP 113 L37
                    ERROR
                L37
                NOOP
                MOVE TEMP 110 PLUS 4 PLUS TEMP 111 TEMP 110
                HLOAD TEMP 112 TEMP 110 0
                RETURN TEMP 112
            END
            MOVE TEMP 46
                PLUS
                    BEGIN
                        RETURN TEMP 46
                    END
                    1
            JUMP L35
            L36
            NOOP
            PRINT 
            99999
            MOVE TEMP 115
            0
            RETURN TEMP 115
        END
        Size_2_BS_Init [ 1 ]
        BEGIN
            HSTORE TEMP 0 8
                BEGIN
                    RETURN TEMP 1
                END
            HSTORE TEMP 0 4
                BEGIN
                MOVE TEMP 117
                BEGIN
                    RETURN TEMP 1
                END
                    MOVE TEMP 118 HALLOCATE TIMES 4 PLUS 1 TEMP 117
                    HSTORE TEMP 118 0 TEMP 117
                    MOVE TEMP 119 4
                    L38
                    CJUMP LT TEMP 119 TIMES 4 PLUS 1 TEMP 117 L39
                    HSTORE PLUS TEMP 118 TEMP 119 0 0
                    MOVE TEMP 119 PLUS TEMP 119 4
                    JUMP L38
                    L39 NOOP
                    RETURN TEMP 118
                END
            MOVE TEMP 42
                1
            MOVE TEMP 43
                PLUS
                    BEGIN
                        HLOAD TEMP 120 TEMP 0 8
                        RETURN TEMP 120
                    END
                    1
            L40
             CJUMP 
            LT
                BEGIN
                    RETURN TEMP 42
                END
                BEGIN
                    HLOAD TEMP 121 TEMP 0 8
                    RETURN TEMP 121
                END
            L41
            MOVE TEMP 41
                TIMES
                    2
                    BEGIN
                        RETURN TEMP 42
                    END
            MOVE TEMP 40
                MINUS
                    BEGIN
                        RETURN TEMP 43
                    END
                    3
            MOVE TEMP 122
                BEGIN
                    RETURN TEMP 42
                END
            HLOAD TEMP 123TEMP 0 4
            HLOAD TEMP 124 TEMP 123 0
            CJUMP MINUS 1 LT TEMP 122 TEMP 124 L42
                ERROR
            L42
            HSTORE PLUS TEMP 123 TIMES 4 PLUS 1 TEMP 122 0
            PLUS
                BEGIN
                    RETURN TEMP 41
                END
                BEGIN
                    RETURN TEMP 40
                END
            MOVE TEMP 42
                PLUS
                    BEGIN
                        RETURN TEMP 42
                    END
                    1
            MOVE TEMP 43
                MINUS
                    BEGIN
                        RETURN TEMP 43
                    END
                    1
            JUMP L40
            L41
            NOOP
            MOVE TEMP 125
            0
            RETURN TEMP 125
        END
