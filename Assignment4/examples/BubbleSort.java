MAIN
    PRINT 
    BEGIN
        MOVE TEMP 42
            BEGIN
                MOVE TEMP 44 HALLOCATE 12
                MOVE TEMP 45 HALLOCATE 16
                HSTORE TEMP 45 0 Size_3_BBS_Sort
                HSTORE TEMP 45 4 Size_3_BBS_Start
                HSTORE TEMP 45 8 Size_3_BBS_Init
                HSTORE TEMP 45 12 Size_3_BBS_Print
                MOVE TEMP 46 4
                L0
                CJUMP LT TEMP 46 12 L1
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
            10
        )
    END
END
    Size_3_BBS_Start [ 1 ]
    BEGIN
        MOVE TEMP 40
            BEGIN
                MOVE TEMP 49
                    TEMP 0
                HLOAD TEMP 50 TEMP 49 0
                HLOAD TEMP 51 TEMP 50 8
                RETURN
                CALL TEMP 51
                (
                    TEMP 49
                    BEGIN
                        RETURN TEMP 1
                    END
                )
            END
        MOVE TEMP 40
            BEGIN
                MOVE TEMP 52
                    TEMP 0
                HLOAD TEMP 53 TEMP 52 0
                HLOAD TEMP 54 TEMP 53 12
                RETURN
                CALL TEMP 54
                (
                    TEMP 52
                )
            END
        PRINT 
        99999
        MOVE TEMP 40
            BEGIN
                MOVE TEMP 55
                    TEMP 0
                HLOAD TEMP 56 TEMP 55 0
                HLOAD TEMP 57 TEMP 56 0
                RETURN
                CALL TEMP 57
                (
                    TEMP 55
                )
            END
        MOVE TEMP 40
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
    Size_3_BBS_Sort [ 0 ]
    BEGIN
        MOVE TEMP 39
            MINUS
                BEGIN
                    HLOAD TEMP 62 TEMP 0 8
                    RETURN TEMP 62
                END
                1
        MOVE TEMP 37
            MINUS
                0
                1
        L2
         CJUMP 
        LT
            BEGIN
                RETURN TEMP 37
            END
            BEGIN
                RETURN TEMP 39
            END
        L3
        MOVE TEMP 38
            1
        L4
         CJUMP 
        LT
            BEGIN
                RETURN TEMP 38
            END
            PLUS
                BEGIN
                    RETURN TEMP 39
                END
                1
        L5
        MOVE TEMP 33
            MINUS
                BEGIN
                    RETURN TEMP 38
                END
                1
        MOVE TEMP 36
            BEGIN
                MOVE TEMP 63
                BEGIN
                    HLOAD TEMP 67 TEMP 0 4
                    RETURN TEMP 67
                END
                MOVE TEMP 64
                BEGIN
                    RETURN TEMP 33
                END
                MOVE TEMP 64 TIMES 4 TEMP 64
                HLOAD TEMP 66 TEMP 63 0
                CJUMP MINUS 1 LT TEMP 64 TIMES 4 TEMP 66 L6
                    ERROR
                L6
                NOOP
                MOVE TEMP 63 PLUS 4 PLUS TEMP 64 TEMP 63
                HLOAD TEMP 65 TEMP 63 0
                RETURN TEMP 65
            END
        MOVE TEMP 35
            BEGIN
                MOVE TEMP 68
                BEGIN
                    HLOAD TEMP 72 TEMP 0 4
                    RETURN TEMP 72
                END
                MOVE TEMP 69
                BEGIN
                    RETURN TEMP 38
                END
                MOVE TEMP 69 TIMES 4 TEMP 69
                HLOAD TEMP 71 TEMP 68 0
                CJUMP MINUS 1 LT TEMP 69 TIMES 4 TEMP 71 L7
                    ERROR
                L7
                NOOP
                MOVE TEMP 68 PLUS 4 PLUS TEMP 69 TEMP 68
                HLOAD TEMP 70 TEMP 68 0
                RETURN TEMP 70
            END
        CJUMP
            LT
                BEGIN
                    RETURN TEMP 35
                END
                BEGIN
                    RETURN TEMP 36
                END
            L8
            MOVE TEMP 34
                MINUS
                    BEGIN
                        RETURN TEMP 38
                    END
                    1
            MOVE TEMP 32
                BEGIN
                    MOVE TEMP 73
                    BEGIN
                        HLOAD TEMP 77 TEMP 0 4
                        RETURN TEMP 77
                    END
                    MOVE TEMP 74
                    BEGIN
                        RETURN TEMP 34
                    END
                    MOVE TEMP 74 TIMES 4 TEMP 74
                    HLOAD TEMP 76 TEMP 73 0
                    CJUMP MINUS 1 LT TEMP 74 TIMES 4 TEMP 76 L10
                        ERROR
                    L10
                    NOOP
                    MOVE TEMP 73 PLUS 4 PLUS TEMP 74 TEMP 73
                    HLOAD TEMP 75 TEMP 73 0
                    RETURN TEMP 75
                END
            MOVE TEMP 78
                BEGIN
                    RETURN TEMP 34
                END
            HLOAD TEMP 79TEMP 0 4
            HLOAD TEMP 80 TEMP 79 0
            CJUMP MINUS 1 LT TEMP 78 TEMP 80 L11
                ERROR
            L11
            HSTORE PLUS TEMP 79 TIMES 4 PLUS 1 TEMP 78 0
            BEGIN
                MOVE TEMP 81
                BEGIN
                    HLOAD TEMP 85 TEMP 0 4
                    RETURN TEMP 85
                END
                MOVE TEMP 82
                BEGIN
                    RETURN TEMP 38
                END
                MOVE TEMP 82 TIMES 4 TEMP 82
                HLOAD TEMP 84 TEMP 81 0
                CJUMP MINUS 1 LT TEMP 82 TIMES 4 TEMP 84 L12
                    ERROR
                L12
                NOOP
                MOVE TEMP 81 PLUS 4 PLUS TEMP 82 TEMP 81
                HLOAD TEMP 83 TEMP 81 0
                RETURN TEMP 83
            END
            MOVE TEMP 86
                BEGIN
                    RETURN TEMP 38
                END
            HLOAD TEMP 87TEMP 0 4
            HLOAD TEMP 88 TEMP 87 0
            CJUMP MINUS 1 LT TEMP 86 TEMP 88 L13
                ERROR
            L13
            HSTORE PLUS TEMP 87 TIMES 4 PLUS 1 TEMP 86 0
            BEGIN
                RETURN TEMP 32
            END
            JUMP L9
            L8 NOOP
            MOVE TEMP 31
                0
            L9
            NOOP
        MOVE TEMP 38
            PLUS
                BEGIN
                    RETURN TEMP 38
                END
                1
        JUMP L4
        L5
        NOOP
        MOVE TEMP 39
            MINUS
                BEGIN
                    RETURN TEMP 39
                END
                1
        JUMP L2
        L3
        NOOP
        MOVE TEMP 89
        0
        RETURN TEMP 89
    END
    Size_3_BBS_Print [ 0 ]
    BEGIN
        MOVE TEMP 41
            0
        L14
         CJUMP 
        LT
            BEGIN
                RETURN TEMP 41
            END
            BEGIN
                HLOAD TEMP 90 TEMP 0 8
                RETURN TEMP 90
            END
        L15
        PRINT 
        BEGIN
            MOVE TEMP 91
            BEGIN
                HLOAD TEMP 95 TEMP 0 4
                RETURN TEMP 95
            END
            MOVE TEMP 92
            BEGIN
                RETURN TEMP 41
            END
            MOVE TEMP 92 TIMES 4 TEMP 92
            HLOAD TEMP 94 TEMP 91 0
            CJUMP MINUS 1 LT TEMP 92 TIMES 4 TEMP 94 L16
                ERROR
            L16
            NOOP
            MOVE TEMP 91 PLUS 4 PLUS TEMP 92 TEMP 91
            HLOAD TEMP 93 TEMP 91 0
            RETURN TEMP 93
        END
        MOVE TEMP 41
            PLUS
                BEGIN
                    RETURN TEMP 41
                END
                1
        JUMP L14
        L15
        NOOP
        MOVE TEMP 96
        0
        RETURN TEMP 96
    END
    Size_3_BBS_Init [ 1 ]
    BEGIN
        HSTORE TEMP 0 8
            BEGIN
                RETURN TEMP 1
            END
        HSTORE TEMP 0 4
            BEGIN
            MOVE TEMP 98
            BEGIN
                RETURN TEMP 1
            END
                MOVE TEMP 99 HALLOCATE TIMES 4 PLUS 1 TEMP 98
                HSTORE TEMP 99 0 TEMP 98
                MOVE TEMP 100 4
                L17
                CJUMP LT TEMP 100 TIMES 4 PLUS 1 TEMP 98 L18
                HSTORE PLUS TEMP 99 TEMP 100 0 0
                MOVE TEMP 100 PLUS TEMP 100 4
                JUMP L17
                L18 NOOP
                RETURN TEMP 99
            END
        MOVE TEMP 101
            0
        HLOAD TEMP 102TEMP 0 4
        HLOAD TEMP 103 TEMP 102 0
        CJUMP MINUS 1 LT TEMP 101 TEMP 103 L19
            ERROR
        L19
        HSTORE PLUS TEMP 102 TIMES 4 PLUS 1 TEMP 101 0
        20
        MOVE TEMP 104
            1
        HLOAD TEMP 105TEMP 0 4
        HLOAD TEMP 106 TEMP 105 0
        CJUMP MINUS 1 LT TEMP 104 TEMP 106 L20
            ERROR
        L20
        HSTORE PLUS TEMP 105 TIMES 4 PLUS 1 TEMP 104 0
        7
        MOVE TEMP 107
            2
        HLOAD TEMP 108TEMP 0 4
        HLOAD TEMP 109 TEMP 108 0
        CJUMP MINUS 1 LT TEMP 107 TEMP 109 L21
            ERROR
        L21
        HSTORE PLUS TEMP 108 TIMES 4 PLUS 1 TEMP 107 0
        12
        MOVE TEMP 110
            3
        HLOAD TEMP 111TEMP 0 4
        HLOAD TEMP 112 TEMP 111 0
        CJUMP MINUS 1 LT TEMP 110 TEMP 112 L22
            ERROR
        L22
        HSTORE PLUS TEMP 111 TIMES 4 PLUS 1 TEMP 110 0
        18
        MOVE TEMP 113
            4
        HLOAD TEMP 114TEMP 0 4
        HLOAD TEMP 115 TEMP 114 0
        CJUMP MINUS 1 LT TEMP 113 TEMP 115 L23
            ERROR
        L23
        HSTORE PLUS TEMP 114 TIMES 4 PLUS 1 TEMP 113 0
        2
        MOVE TEMP 116
            5
        HLOAD TEMP 117TEMP 0 4
        HLOAD TEMP 118 TEMP 117 0
        CJUMP MINUS 1 LT TEMP 116 TEMP 118 L24
            ERROR
        L24
        HSTORE PLUS TEMP 117 TIMES 4 PLUS 1 TEMP 116 0
        11
        MOVE TEMP 119
            6
        HLOAD TEMP 120TEMP 0 4
        HLOAD TEMP 121 TEMP 120 0
        CJUMP MINUS 1 LT TEMP 119 TEMP 121 L25
            ERROR
        L25
        HSTORE PLUS TEMP 120 TIMES 4 PLUS 1 TEMP 119 0
        6
        MOVE TEMP 122
            7
        HLOAD TEMP 123TEMP 0 4
        HLOAD TEMP 124 TEMP 123 0
        CJUMP MINUS 1 LT TEMP 122 TEMP 124 L26
            ERROR
        L26
        HSTORE PLUS TEMP 123 TIMES 4 PLUS 1 TEMP 122 0
        9
        MOVE TEMP 125
            8
        HLOAD TEMP 126TEMP 0 4
        HLOAD TEMP 127 TEMP 126 0
        CJUMP MINUS 1 LT TEMP 125 TEMP 127 L27
            ERROR
        L27
        HSTORE PLUS TEMP 126 TIMES 4 PLUS 1 TEMP 125 0
        19
        MOVE TEMP 128
            9
        HLOAD TEMP 129TEMP 0 4
        HLOAD TEMP 130 TEMP 129 0
        CJUMP MINUS 1 LT TEMP 128 TEMP 130 L28
            ERROR
        L28
        HSTORE PLUS TEMP 129 TIMES 4 PLUS 1 TEMP 128 0
        5
        MOVE TEMP 131
        0
        RETURN TEMP 131
    END
