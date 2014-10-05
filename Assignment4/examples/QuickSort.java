MAIN
    PRINT 
    BEGIN
        MOVE TEMP 41
            BEGIN
                MOVE TEMP 43 HALLOCATE 12
                MOVE TEMP 44 HALLOCATE 16
                HSTORE TEMP 44 0 Size_2_QS_Sort
                HSTORE TEMP 44 4 Size_2_QS_Start
                HSTORE TEMP 44 8 Size_2_QS_Init
                HSTORE TEMP 44 12 Size_2_QS_Print
                MOVE TEMP 45 4
                L0
                CJUMP LT TEMP 45 12 L1
                HSTORE PLUS TEMP 43 TEMP 45 0 0
                MOVE TEMP 45 PLUS TEMP 45 4
                JUMP L0
                L1
                HSTORE TEMP 43 0 TEMP 44
                RETURN TEMP 43
            END
        HLOAD TEMP 46 TEMP 41 0
        HLOAD TEMP 47 TEMP 46 4
        RETURN
        CALL TEMP 47
        (
            TEMP 41
            10
        )
    END
END
    Size_2_QS_Start [ 1 ]
    BEGIN
        MOVE TEMP 39
            BEGIN
                MOVE TEMP 48
                    TEMP 0
                HLOAD TEMP 49 TEMP 48 0
                HLOAD TEMP 50 TEMP 49 8
                RETURN
                CALL TEMP 50
                (
                    TEMP 48
                    BEGIN
                        RETURN TEMP 1
                    END
                )
            END
        MOVE TEMP 39
            BEGIN
                MOVE TEMP 51
                    TEMP 0
                HLOAD TEMP 52 TEMP 51 0
                HLOAD TEMP 53 TEMP 52 12
                RETURN
                CALL TEMP 53
                (
                    TEMP 51
                )
            END
        PRINT 
        9999
        MOVE TEMP 39
            MINUS
                BEGIN
                    HLOAD TEMP 54 TEMP 0 8
                    RETURN TEMP 54
                END
                1
        MOVE TEMP 39
            BEGIN
                MOVE TEMP 55
                    TEMP 0
                HLOAD TEMP 56 TEMP 55 0
                HLOAD TEMP 57 TEMP 56 0
                RETURN
                CALL TEMP 57
                (
                    TEMP 55
                    0
                    BEGIN
                        RETURN TEMP 39
                    END
                )
            END
        MOVE TEMP 39
            BEGIN
                MOVE TEMP 58
                    TEMP 0
                HLOAD TEMP 59 TEMP 58 0
                HLOAD TEMP 60 TEMP 59 12
                RETURN
                CALL TEMP 60
                (
                    TEMP 58
                )
            END
        MOVE TEMP 61
        0
        RETURN TEMP 61
    END
    Size_2_QS_Sort [ 2 ]
    BEGIN
        MOVE TEMP 34
            0
        CJUMP
            LT
                BEGIN
                    RETURN TEMP 1
                END
                BEGIN
                    RETURN TEMP 2
                END
            L2
            MOVE TEMP 32
                BEGIN
                    MOVE TEMP 62
                    BEGIN
                        HLOAD TEMP 66 TEMP 0 4
                        RETURN TEMP 66
                    END
                    MOVE TEMP 63
                    BEGIN
                        RETURN TEMP 2
                    END
                    MOVE TEMP 63 TIMES 4 TEMP 63
                    HLOAD TEMP 65 TEMP 62 0
                    CJUMP MINUS 1 LT TEMP 63 TIMES 4 TEMP 65 L4
                        ERROR
                    L4
                    NOOP
                    MOVE TEMP 62 PLUS 4 PLUS TEMP 63 TEMP 62
                    HLOAD TEMP 64 TEMP 62 0
                    RETURN TEMP 64
                END
            MOVE TEMP 38
                MINUS
                    BEGIN
                        RETURN TEMP 1
                    END
                    1
            MOVE TEMP 37
                BEGIN
                    RETURN TEMP 2
                END
            MOVE TEMP 33
                1
            L5
             CJUMP 
            BEGIN
                RETURN TEMP 33
            END
            L6
            MOVE TEMP 35
                1
            L7
             CJUMP 
            BEGIN
                RETURN TEMP 35
            END
            L8
            MOVE TEMP 38
                PLUS
                    BEGIN
                        RETURN TEMP 38
                    END
                    1
            MOVE TEMP 36
                BEGIN
                    MOVE TEMP 67
                    BEGIN
                        HLOAD TEMP 71 TEMP 0 4
                        RETURN TEMP 71
                    END
                    MOVE TEMP 68
                    BEGIN
                        RETURN TEMP 38
                    END
                    MOVE TEMP 68 TIMES 4 TEMP 68
                    HLOAD TEMP 70 TEMP 67 0
                    CJUMP MINUS 1 LT TEMP 68 TIMES 4 TEMP 70 L9
                        ERROR
                    L9
                    NOOP
                    MOVE TEMP 67 PLUS 4 PLUS TEMP 68 TEMP 67
                    HLOAD TEMP 69 TEMP 67 0
                    RETURN TEMP 69
                END
            CJUMP
            MINUS 1 
                LT
                    BEGIN
                        RETURN TEMP 36
                    END
                    BEGIN
                        RETURN TEMP 32
                    END
                L10
                MOVE TEMP 35
                    0
                JUMP L11
                L10 NOOP
                MOVE TEMP 35
                    1
                L11
                NOOP
            JUMP L7
            L8
            NOOP
            MOVE TEMP 35
                1
            L12
             CJUMP 
            BEGIN
                RETURN TEMP 35
            END
            L13
            MOVE TEMP 37
                MINUS
                    BEGIN
                        RETURN TEMP 37
                    END
                    1
            MOVE TEMP 36
                BEGIN
                    MOVE TEMP 73
                    BEGIN
                        HLOAD TEMP 77 TEMP 0 4
                        RETURN TEMP 77
                    END
                    MOVE TEMP 74
                    BEGIN
                        RETURN TEMP 37
                    END
                    MOVE TEMP 74 TIMES 4 TEMP 74
                    HLOAD TEMP 76 TEMP 73 0
                    CJUMP MINUS 1 LT TEMP 74 TIMES 4 TEMP 76 L14
                        ERROR
                    L14
                    NOOP
                    MOVE TEMP 73 PLUS 4 PLUS TEMP 74 TEMP 73
                    HLOAD TEMP 75 TEMP 73 0
                    RETURN TEMP 75
                END
            CJUMP
            MINUS 1 
                LT
                    BEGIN
                        RETURN TEMP 32
                    END
                    BEGIN
                        RETURN TEMP 36
                    END
                L15
                MOVE TEMP 35
                    0
                JUMP L16
                L15 NOOP
                MOVE TEMP 35
                    1
                L16
                NOOP
            JUMP L12
            L13
            NOOP
            MOVE TEMP 34
                BEGIN
                    MOVE TEMP 79
                    BEGIN
                        HLOAD TEMP 83 TEMP 0 4
                        RETURN TEMP 83
                    END
                    MOVE TEMP 80
                    BEGIN
                        RETURN TEMP 38
                    END
                    MOVE TEMP 80 TIMES 4 TEMP 80
                    HLOAD TEMP 82 TEMP 79 0
                    CJUMP MINUS 1 LT TEMP 80 TIMES 4 TEMP 82 L17
                        ERROR
                    L17
                    NOOP
                    MOVE TEMP 79 PLUS 4 PLUS TEMP 80 TEMP 79
                    HLOAD TEMP 81 TEMP 79 0
                    RETURN TEMP 81
                END
            MOVE TEMP 84
                BEGIN
                    RETURN TEMP 38
                END
            HLOAD TEMP 85TEMP 0 4
            HLOAD TEMP 86 TEMP 85 0
            CJUMP MINUS 1 LT TEMP 84 TEMP 86 L18
                ERROR
            L18
            HSTORE PLUS TEMP 85 TIMES 4 PLUS 1 TEMP 84 0
            BEGIN
                MOVE TEMP 87
                BEGIN
                    HLOAD TEMP 91 TEMP 0 4
                    RETURN TEMP 91
                END
                MOVE TEMP 88
                BEGIN
                    RETURN TEMP 37
                END
                MOVE TEMP 88 TIMES 4 TEMP 88
                HLOAD TEMP 90 TEMP 87 0
                CJUMP MINUS 1 LT TEMP 88 TIMES 4 TEMP 90 L19
                    ERROR
                L19
                NOOP
                MOVE TEMP 87 PLUS 4 PLUS TEMP 88 TEMP 87
                HLOAD TEMP 89 TEMP 87 0
                RETURN TEMP 89
            END
            MOVE TEMP 92
                BEGIN
                    RETURN TEMP 37
                END
            HLOAD TEMP 93TEMP 0 4
            HLOAD TEMP 94 TEMP 93 0
            CJUMP MINUS 1 LT TEMP 92 TEMP 94 L20
                ERROR
            L20
            HSTORE PLUS TEMP 93 TIMES 4 PLUS 1 TEMP 92 0
            BEGIN
                RETURN TEMP 34
            END
            CJUMP
                LT
                    BEGIN
                        RETURN TEMP 37
                    END
                    PLUS
                        BEGIN
                            RETURN TEMP 38
                        END
                        1
                L21
                MOVE TEMP 33
                    0
                JUMP L22
                L21 NOOP
                MOVE TEMP 33
                    1
                L22
                NOOP
            JUMP L5
            L6
            NOOP
            MOVE TEMP 95
                BEGIN
                    RETURN TEMP 37
                END
            HLOAD TEMP 96TEMP 0 4
            HLOAD TEMP 97 TEMP 96 0
            CJUMP MINUS 1 LT TEMP 95 TEMP 97 L23
                ERROR
            L23
            HSTORE PLUS TEMP 96 TIMES 4 PLUS 1 TEMP 95 0
            BEGIN
                MOVE TEMP 98
                BEGIN
                    HLOAD TEMP 102 TEMP 0 4
                    RETURN TEMP 102
                END
                MOVE TEMP 99
                BEGIN
                    RETURN TEMP 38
                END
                MOVE TEMP 99 TIMES 4 TEMP 99
                HLOAD TEMP 101 TEMP 98 0
                CJUMP MINUS 1 LT TEMP 99 TIMES 4 TEMP 101 L24
                    ERROR
                L24
                NOOP
                MOVE TEMP 98 PLUS 4 PLUS TEMP 99 TEMP 98
                HLOAD TEMP 100 TEMP 98 0
                RETURN TEMP 100
            END
            MOVE TEMP 103
                BEGIN
                    RETURN TEMP 38
                END
            HLOAD TEMP 104TEMP 0 4
            HLOAD TEMP 105 TEMP 104 0
            CJUMP MINUS 1 LT TEMP 103 TEMP 105 L25
                ERROR
            L25
            HSTORE PLUS TEMP 104 TIMES 4 PLUS 1 TEMP 103 0
            BEGIN
                MOVE TEMP 106
                BEGIN
                    HLOAD TEMP 110 TEMP 0 4
                    RETURN TEMP 110
                END
                MOVE TEMP 107
                BEGIN
                    RETURN TEMP 2
                END
                MOVE TEMP 107 TIMES 4 TEMP 107
                HLOAD TEMP 109 TEMP 106 0
                CJUMP MINUS 1 LT TEMP 107 TIMES 4 TEMP 109 L26
                    ERROR
                L26
                NOOP
                MOVE TEMP 106 PLUS 4 PLUS TEMP 107 TEMP 106
                HLOAD TEMP 108 TEMP 106 0
                RETURN TEMP 108
            END
            MOVE TEMP 111
                BEGIN
                    RETURN TEMP 2
                END
            HLOAD TEMP 112TEMP 0 4
            HLOAD TEMP 113 TEMP 112 0
            CJUMP MINUS 1 LT TEMP 111 TEMP 113 L27
                ERROR
            L27
            HSTORE PLUS TEMP 112 TIMES 4 PLUS 1 TEMP 111 0
            BEGIN
                RETURN TEMP 34
            END
            MOVE TEMP 31
                BEGIN
                    MOVE TEMP 114
                        TEMP 0
                    HLOAD TEMP 115 TEMP 114 0
                    HLOAD TEMP 116 TEMP 115 0
                    RETURN
                    CALL TEMP 116
                    (
                        TEMP 114
                        BEGIN
                            RETURN TEMP 1
                        END
                        MINUS
                            BEGIN
                                RETURN TEMP 38
                            END
                            1
                    )
                END
            MOVE TEMP 31
                BEGIN
                    MOVE TEMP 117
                        TEMP 0
                    HLOAD TEMP 118 TEMP 117 0
                    HLOAD TEMP 119 TEMP 118 0
                    RETURN
                    CALL TEMP 119
                    (
                        TEMP 117
                        PLUS
                            BEGIN
                                RETURN TEMP 38
                            END
                            1
                        BEGIN
                            RETURN TEMP 2
                        END
                    )
                END
            JUMP L3
            L2 NOOP
            MOVE TEMP 31
                0
            L3
            NOOP
        MOVE TEMP 120
        0
        RETURN TEMP 120
    END
    Size_2_QS_Print [ 0 ]
    BEGIN
        MOVE TEMP 40
            0
        L28
         CJUMP 
        LT
            BEGIN
                RETURN TEMP 40
            END
            BEGIN
                HLOAD TEMP 121 TEMP 0 8
                RETURN TEMP 121
            END
        L29
        PRINT 
        BEGIN
            MOVE TEMP 122
            BEGIN
                HLOAD TEMP 126 TEMP 0 4
                RETURN TEMP 126
            END
            MOVE TEMP 123
            BEGIN
                RETURN TEMP 40
            END
            MOVE TEMP 123 TIMES 4 TEMP 123
            HLOAD TEMP 125 TEMP 122 0
            CJUMP MINUS 1 LT TEMP 123 TIMES 4 TEMP 125 L30
                ERROR
            L30
            NOOP
            MOVE TEMP 122 PLUS 4 PLUS TEMP 123 TEMP 122
            HLOAD TEMP 124 TEMP 122 0
            RETURN TEMP 124
        END
        MOVE TEMP 40
            PLUS
                BEGIN
                    RETURN TEMP 40
                END
                1
        JUMP L28
        L29
        NOOP
        MOVE TEMP 127
        0
        RETURN TEMP 127
    END
    Size_2_QS_Init [ 1 ]
    BEGIN
        HSTORE TEMP 0 8
            BEGIN
                RETURN TEMP 1
            END
        HSTORE TEMP 0 4
            BEGIN
            MOVE TEMP 129
            BEGIN
                RETURN TEMP 1
            END
                MOVE TEMP 130 HALLOCATE TIMES 4 PLUS 1 TEMP 129
                HSTORE TEMP 130 0 TEMP 129
                MOVE TEMP 131 4
                L31
                CJUMP LT TEMP 131 TIMES 4 PLUS 1 TEMP 129 L32
                HSTORE PLUS TEMP 130 TEMP 131 0 0
                MOVE TEMP 131 PLUS TEMP 131 4
                JUMP L31
                L32 NOOP
                RETURN TEMP 130
            END
        MOVE TEMP 132
            0
        HLOAD TEMP 133TEMP 0 4
        HLOAD TEMP 134 TEMP 133 0
        CJUMP MINUS 1 LT TEMP 132 TEMP 134 L33
            ERROR
        L33
        HSTORE PLUS TEMP 133 TIMES 4 PLUS 1 TEMP 132 0
        20
        MOVE TEMP 135
            1
        HLOAD TEMP 136TEMP 0 4
        HLOAD TEMP 137 TEMP 136 0
        CJUMP MINUS 1 LT TEMP 135 TEMP 137 L34
            ERROR
        L34
        HSTORE PLUS TEMP 136 TIMES 4 PLUS 1 TEMP 135 0
        7
        MOVE TEMP 138
            2
        HLOAD TEMP 139TEMP 0 4
        HLOAD TEMP 140 TEMP 139 0
        CJUMP MINUS 1 LT TEMP 138 TEMP 140 L35
            ERROR
        L35
        HSTORE PLUS TEMP 139 TIMES 4 PLUS 1 TEMP 138 0
        12
        MOVE TEMP 141
            3
        HLOAD TEMP 142TEMP 0 4
        HLOAD TEMP 143 TEMP 142 0
        CJUMP MINUS 1 LT TEMP 141 TEMP 143 L36
            ERROR
        L36
        HSTORE PLUS TEMP 142 TIMES 4 PLUS 1 TEMP 141 0
        18
        MOVE TEMP 144
            4
        HLOAD TEMP 145TEMP 0 4
        HLOAD TEMP 146 TEMP 145 0
        CJUMP MINUS 1 LT TEMP 144 TEMP 146 L37
            ERROR
        L37
        HSTORE PLUS TEMP 145 TIMES 4 PLUS 1 TEMP 144 0
        2
        MOVE TEMP 147
            5
        HLOAD TEMP 148TEMP 0 4
        HLOAD TEMP 149 TEMP 148 0
        CJUMP MINUS 1 LT TEMP 147 TEMP 149 L38
            ERROR
        L38
        HSTORE PLUS TEMP 148 TIMES 4 PLUS 1 TEMP 147 0
        11
        MOVE TEMP 150
            6
        HLOAD TEMP 151TEMP 0 4
        HLOAD TEMP 152 TEMP 151 0
        CJUMP MINUS 1 LT TEMP 150 TEMP 152 L39
            ERROR
        L39
        HSTORE PLUS TEMP 151 TIMES 4 PLUS 1 TEMP 150 0
        6
        MOVE TEMP 153
            7
        HLOAD TEMP 154TEMP 0 4
        HLOAD TEMP 155 TEMP 154 0
        CJUMP MINUS 1 LT TEMP 153 TEMP 155 L40
            ERROR
        L40
        HSTORE PLUS TEMP 154 TIMES 4 PLUS 1 TEMP 153 0
        9
        MOVE TEMP 156
            8
        HLOAD TEMP 157TEMP 0 4
        HLOAD TEMP 158 TEMP 157 0
        CJUMP MINUS 1 LT TEMP 156 TEMP 158 L41
            ERROR
        L41
        HSTORE PLUS TEMP 157 TIMES 4 PLUS 1 TEMP 156 0
        19
        MOVE TEMP 159
            9
        HLOAD TEMP 160TEMP 0 4
        HLOAD TEMP 161 TEMP 160 0
        CJUMP MINUS 1 LT TEMP 159 TEMP 161 L42
            ERROR
        L42
        HSTORE PLUS TEMP 160 TIMES 4 PLUS 1 TEMP 159 0
        5
        MOVE TEMP 162
        0
        RETURN TEMP 162
    END
