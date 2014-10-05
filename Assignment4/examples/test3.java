MAIN
    PRINT 
    BEGIN
        MOVE TEMP 42
            BEGIN
                MOVE TEMP 44 HALLOCATE 8
                MOVE TEMP 45 HALLOCATE 40
                HSTORE TEMP 45 0 Size_2_BS_End
                HSTORE TEMP 45 4 Size_2_BS_Start
                HSTORE TEMP 45 8 Size_2_BS_globalarrayaccesstest
                HSTORE TEMP 45 12 Size_2_BS_arraylengthtest
                HSTORE TEMP 45 16 Size_2_BS_arrayaccesstest
                HSTORE TEMP 45 20 Size_2_BS_Array
                HSTORE TEMP 45 24 Size_2_BS_not_test
                HSTORE TEMP 45 28 Size_2_BS_whiletest
                HSTORE TEMP 45 32 Size_2_BS_newarrayinittest
                HSTORE TEMP 45 36 Size_2_BS_calltest
                MOVE TEMP 46 4
                L0
                CJUMP LT TEMP 46 8 L1
                HSTORE PLUS TEMP 44 TEMP 46 0 0
                MOVE TEMP 46 PLUS TEMP 46 4
                JUMP L0
                L1
                HSTORE TEMP 44 0 TEMP 45
                RETURN TEMP 44
            END
        HLOAD TEMP 47 TEMP 42 0
        HLOAD TEMP 48 TEMP 47 4
        RETURN
        CALL TEMP 48
        (
            TEMP 42
            20
        )
    END
END
    Size_2_GS_Start [ 1 ]
    BEGIN
        MOVE TEMP 49
        9
        RETURN TEMP 49
    END
    Size_2_GS_End [ 3 ]
    BEGIN
        MOVE TEMP 50
        10000
        RETURN TEMP 50
    END
    Size_2_BS_Start [ 1 ]
    BEGIN
        MOVE TEMP 32
            9
        MOVE TEMP 33
            BEGIN
            MOVE TEMP 52
            10
                MOVE TEMP 53 HALLOCATE TIMES 4 PLUS 1 TEMP 52
                HSTORE TEMP 53 0 TEMP 52
                MOVE TEMP 54 4
                L2
                CJUMP LT TEMP 54 TIMES 4 PLUS 1 TEMP 52 L3
                HSTORE PLUS TEMP 53 TEMP 54 0 0
                MOVE TEMP 54 PLUS TEMP 54 4
                JUMP L2
                L3 NOOP
                RETURN TEMP 53
            END
        MOVE TEMP 33
            BEGIN
                MOVE TEMP 55
                    TEMP 0
                HLOAD TEMP 56 TEMP 55 0
                HLOAD TEMP 57 TEMP 56 20
                RETURN
                CALL TEMP 57
                (
                    TEMP 55
                    8
                )
            END
        MOVE TEMP 32
            BEGIN
                MOVE TEMP 58
                BEGIN
                    RETURN TEMP 33
                END
                MOVE TEMP 59
                7
                MOVE TEMP 59 TIMES 4 TEMP 59
                HLOAD TEMP 61 TEMP 58 0
                CJUMP MINUS 1 LT TEMP 59 TIMES 4 TEMP 61 L4
                    ERROR
                L4
                NOOP
                MOVE TEMP 58 PLUS 4 PLUS TEMP 59 TEMP 58
                HLOAD TEMP 60 TEMP 58 0
                RETURN TEMP 60
            END
        MOVE TEMP 62
        BEGIN
            RETURN TEMP 32
        END
        RETURN TEMP 62
    END
    Size_2_BS_Array [ 1 ]
    BEGIN
        MOVE TEMP 37
            BEGIN
            MOVE TEMP 64
            BEGIN
                RETURN TEMP 1
            END
                MOVE TEMP 65 HALLOCATE TIMES 4 PLUS 1 TEMP 64
                HSTORE TEMP 65 0 TEMP 64
                MOVE TEMP 66 4
                L5
                CJUMP LT TEMP 66 TIMES 4 PLUS 1 TEMP 64 L6
                HSTORE PLUS TEMP 65 TEMP 66 0 0
                MOVE TEMP 66 PLUS TEMP 66 4
                JUMP L5
                L6 NOOP
                RETURN TEMP 65
            END
        PRINT 
        1
        MOVE TEMP 36
            BEGIN
                MOVE TEMP 67
                BEGIN
                    RETURN TEMP 37
                END
                MOVE TEMP 68
                MINUS
                    BEGIN
                        RETURN TEMP 1
                    END
                    1
                MOVE TEMP 68 TIMES 4 TEMP 68
                HLOAD TEMP 70 TEMP 67 0
                CJUMP MINUS 1 LT TEMP 68 TIMES 4 TEMP 70 L7
                    ERROR
                L7
                NOOP
                MOVE TEMP 67 PLUS 4 PLUS TEMP 68 TEMP 67
                HLOAD TEMP 69 TEMP 67 0
                RETURN TEMP 69
            END
        MOVE TEMP 71
            0
        HSTORE PLUS TEMP 37 TIMES 4 PLUS 1 TEMP 71 0
            101
            MOVE TEMP 72
                0
            HSTORE PLUS TEMP 37 TIMES 4 PLUS 1 TEMP 72 0
                BEGIN
                    RETURN TEMP 36
                END
                MOVE TEMP 73
                    7
                HSTORE PLUS TEMP 37 TIMES 4 PLUS 1 TEMP 73 0
                    BEGIN
                        MOVE TEMP 74
                            TEMP 0
                        HLOAD TEMP 75 TEMP 74 0
                        HLOAD TEMP 76 TEMP 75 0
                        RETURN
                        CALL TEMP 76
                        (
                            TEMP 74
                            1
                            1
                            BEGIN
                                MOVE TEMP 77
                                BEGIN
                                    RETURN TEMP 37
                                END
                                MOVE TEMP 78
                                0
                                MOVE TEMP 78 TIMES 4 TEMP 78
                                HLOAD TEMP 80 TEMP 77 0
                                CJUMP MINUS 1 LT TEMP 78 TIMES 4 TEMP 80 L8
                                    ERROR
                                L8
                                NOOP
                                MOVE TEMP 77 PLUS 4 PLUS TEMP 78 TEMP 77
                                HLOAD TEMP 79 TEMP 77 0
                                RETURN TEMP 79
                            END
                        )
                    END
                    MOVE TEMP 81
                    BEGIN
                        RETURN TEMP 37
                    END
                    RETURN TEMP 81
                END
                Size_2_BS_End [ 3 ]
                BEGIN
                    MOVE TEMP 31
                        BEGIN
                            MOVE TEMP 82
                                TEMP 0
                            HLOAD TEMP 83 TEMP 82 0
                            HLOAD TEMP 84 TEMP 83 24
                            RETURN
                            CALL TEMP 84
                            (
                                TEMP 82
                                1
                            )
                        END
                    MOVE TEMP 85
                    PLUS
                        BEGIN
                            RETURN TEMP 3
                        END
                        BEGIN
                            RETURN TEMP 31
                        END
                    RETURN TEMP 85
                END
                Size_2_BS_not_test [ 1 ]
                BEGIN
                    CJUMP
                    MINUS 1 
                        BEGIN
                            RETURN TEMP 1
                        END
                        L9
                        MOVE TEMP 38
                            78
                        JUMP L10
                        L9 NOOP
                        MOVE TEMP 38
                            99
                        L10
                        NOOP
                    MOVE TEMP 38
                        BEGIN
                            MOVE TEMP 87
                                TEMP 0
                            HLOAD TEMP 88 TEMP 87 0
                            HLOAD TEMP 89 TEMP 88 32
                            RETURN
                            CALL TEMP 89
                            (
                                TEMP 87
                                BEGIN
                                    RETURN TEMP 38
                                END
                            )
                        END
                    MOVE TEMP 90
                    BEGIN
                        RETURN TEMP 38
                    END
                    RETURN TEMP 90
                END
                Size_2_BS_newarrayinittest [ 1 ]
                BEGIN
                    MOVE TEMP 40
                        BEGIN
                        MOVE TEMP 92
                        8
                            MOVE TEMP 93 HALLOCATE TIMES 4 PLUS 1 TEMP 92
                            HSTORE TEMP 93 0 TEMP 92
                            MOVE TEMP 94 4
                            L11
                            CJUMP LT TEMP 94 TIMES 4 PLUS 1 TEMP 92 L12
                            HSTORE PLUS TEMP 93 TEMP 94 0 0
                            MOVE TEMP 94 PLUS TEMP 94 4
                            JUMP L11
                            L12 NOOP
                            RETURN TEMP 93
                        END
                    MOVE TEMP 95
                        7
                    HSTORE PLUS TEMP 40 TIMES 4 PLUS 1 TEMP 95 0
                        BEGIN
                            MOVE TEMP 96
                                TEMP 0
                            HLOAD TEMP 97 TEMP 96 0
                            HLOAD TEMP 98 TEMP 97 12
                            RETURN
                            CALL TEMP 98
                            (
                                TEMP 96
                                8
                            )
                        END
                        MOVE TEMP 99
                        PLUS
                            BEGIN
                                MOVE TEMP 100
                                BEGIN
                                    RETURN TEMP 40
                                END
                                MOVE TEMP 101
                                7
                                MOVE TEMP 101 TIMES 4 TEMP 101
                                HLOAD TEMP 103 TEMP 100 0
                                CJUMP MINUS 1 LT TEMP 101 TIMES 4 TEMP 103 L13
                                    ERROR
                                L13
                                NOOP
                                MOVE TEMP 100 PLUS 4 PLUS TEMP 101 TEMP 100
                                HLOAD TEMP 102 TEMP 100 0
                                RETURN TEMP 102
                            END
                            BEGIN
                                RETURN TEMP 1
                            END
                        RETURN TEMP 99
                    END
                    Size_2_BS_arraylengthtest [ 1 ]
                    BEGIN
                        MOVE TEMP 34
                            BEGIN
                            MOVE TEMP 105
                            15
                                MOVE TEMP 106 HALLOCATE TIMES 4 PLUS 1 TEMP 105
                                HSTORE TEMP 106 0 TEMP 105
                                MOVE TEMP 107 4
                                L14
                                CJUMP LT TEMP 107 TIMES 4 PLUS 1 TEMP 105 L15
                                HSTORE PLUS TEMP 106 TEMP 107 0 0
                                MOVE TEMP 107 PLUS TEMP 107 4
                                JUMP L14
                                L15 NOOP
                                RETURN TEMP 106
                            END
                        MOVE TEMP 108
                        PLUS
                            BEGIN
                                MOVE TEMP 109
                                BEGIN
                                    RETURN TEMP 34
                                END
                                HLOAD TEMP 110 TEMP 109 0
                                RETURN TEMP 110
                                END
                                BEGIN
                                    MOVE TEMP 111
                                        TEMP 0
                                    HLOAD TEMP 112 TEMP 111 0
                                    HLOAD TEMP 113 TEMP 112 36
                                    RETURN
                                    CALL TEMP 113
                                    (
                                        TEMP 111
                                        100
                                    )
                                END
                            RETURN TEMP 108
                        END
                        Size_2_BS_calltest [ 1 ]
                        BEGIN
                            MOVE TEMP 41
                                BEGIN
                                    MOVE TEMP 115 HALLOCATE 4
                                    MOVE TEMP 116 HALLOCATE 8
                                    HSTORE TEMP 116 0 Size_2_GS_End
                                    HSTORE TEMP 116 4 Size_2_GS_Start
                                    MOVE TEMP 117 4
                                    L16
                                    CJUMP LT TEMP 117 4 L17
                                    HSTORE PLUS TEMP 115 TEMP 117 0 0
                                    MOVE TEMP 117 PLUS TEMP 117 4
                                    JUMP L16
                                    L17
                                    HSTORE TEMP 115 0 TEMP 116
                                    RETURN TEMP 115
                                END
                            MOVE TEMP 1
                                BEGIN
                                    MOVE TEMP 118
                                        BEGIN
                                            RETURN TEMP 41
                                        END
                                    HLOAD TEMP 119 TEMP 118 0
                                    HLOAD TEMP 120 TEMP 119 0
                                    RETURN
                                    CALL TEMP 120
                                    (
                                        TEMP 118
                                        BEGIN
                                            RETURN TEMP 1
                                        END
                                        1
                                        BEGIN
                                            RETURN TEMP 1
                                        END
                                    )
                                END
                            MOVE TEMP 121
                            PLUS
                                BEGIN
                                    RETURN TEMP 1
                                END
                                BEGIN
                                    MOVE TEMP 122
                                        TEMP 0
                                    HLOAD TEMP 123 TEMP 122 0
                                    HLOAD TEMP 124 TEMP 123 16
                                    RETURN
                                    CALL TEMP 124
                                    (
                                        TEMP 122
                                    )
                                END
                            RETURN TEMP 121
                        END
                        Size_2_BS_arrayaccesstest [ 0 ]
                        BEGIN
                            MOVE TEMP 35
                                BEGIN
                                MOVE TEMP 126
                                89
                                    MOVE TEMP 127 HALLOCATE TIMES 4 PLUS 1 TEMP 126
                                    HSTORE TEMP 127 0 TEMP 126
                                    MOVE TEMP 128 4
                                    L18
                                    CJUMP LT TEMP 128 TIMES 4 PLUS 1 TEMP 126 L19
                                    HSTORE PLUS TEMP 127 TEMP 128 0 0
                                    MOVE TEMP 128 PLUS TEMP 128 4
                                    JUMP L18
                                    L19 NOOP
                                    RETURN TEMP 127
                                END
                            MOVE TEMP 129
                            PLUS
                                BEGIN
                                    MOVE TEMP 130
                                    BEGIN
                                        RETURN TEMP 35
                                    END
                                    MOVE TEMP 131
                                    78
                                    MOVE TEMP 131 TIMES 4 TEMP 131
                                    HLOAD TEMP 133 TEMP 130 0
                                    CJUMP MINUS 1 LT TEMP 131 TIMES 4 TEMP 133 L20
                                        ERROR
                                    L20
                                    NOOP
                                    MOVE TEMP 130 PLUS 4 PLUS TEMP 131 TEMP 130
                                    HLOAD TEMP 132 TEMP 130 0
                                    RETURN TEMP 132
                                END
                                BEGIN
                                    MOVE TEMP 134
                                        TEMP 0
                                    HLOAD TEMP 135 TEMP 134 0
                                    HLOAD TEMP 136 TEMP 135 8
                                    RETURN
                                    CALL TEMP 136
                                    (
                                        TEMP 134
                                    )
                                END
                            RETURN TEMP 129
                        END
                        Size_2_BS_globalarrayaccesstest [ 0 ]
                        BEGIN
                            MOVE TEMP 137
                            2000
                            RETURN TEMP 137
                        END
                        Size_2_BS_whiletest [ 0 ]
                        BEGIN
                            MOVE TEMP 39
                                1
                            L21
                             CJUMP 
                            BEGIN
                                RETURN TEMP 39
                            END
                            L22
                            MOVE TEMP 39
                                0
                            JUMP L21
                            L22
                            NOOP
                            MOVE TEMP 138
                            0
                            RETURN TEMP 138
                        END
