MAIN
    PRINT 
    BEGIN
        MOVE TEMP 34
            BEGIN
                MOVE TEMP 36 HALLOCATE 4
                MOVE TEMP 37 HALLOCATE 12
                HSTORE TEMP 37 0 Size_4_Test_f1
                HSTORE TEMP 37 4 Size_4_Test_foo
                HSTORE TEMP 37 8 Size_4_Test_f2
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
        HLOAD TEMP 40 TEMP 39 4
        RETURN
        CALL TEMP 40
        (
            TEMP 34
            5
        )
    END
END
    Size_1_A_bar [ 0 ]
    BEGIN
        MOVE TEMP 41
        BEGIN
            MOVE TEMP 43 HALLOCATE 4
            MOVE TEMP 44 HALLOCATE 12
            HSTORE TEMP 44 0 Size_4_Test_f1
            HSTORE TEMP 44 4 Size_4_Test_foo
            HSTORE TEMP 44 8 Size_4_Test_f2
            MOVE TEMP 45 4
            L2
            CJUMP LT TEMP 45 4 L3
            HSTORE PLUS TEMP 43 TEMP 45 0 0
            MOVE TEMP 45 PLUS TEMP 45 4
            JUMP L2
            L3
            HSTORE TEMP 43 0 TEMP 44
            RETURN TEMP 43
        END
        RETURN TEMP 41
    END
    Size_4_Test_foo [ 1 ]
    BEGIN
        MOVE TEMP 32
            BEGIN
                MOVE TEMP 47 HALLOCATE 4
                MOVE TEMP 48 HALLOCATE 4
                HSTORE TEMP 48 0 Size_1_A_bar
                MOVE TEMP 49 4
                L4
                CJUMP LT TEMP 49 4 L5
                HSTORE PLUS TEMP 47 TEMP 49 0 0
                MOVE TEMP 49 PLUS TEMP 49 4
                JUMP L4
                L5
                HSTORE TEMP 47 0 TEMP 48
                RETURN TEMP 47
            END
        MOVE TEMP 31
            BEGIN
                MOVE TEMP 50
                    BEGIN
                        MOVE TEMP 51
                            BEGIN
                                MOVE TEMP 52
                                    BEGIN
                                        MOVE TEMP 54 HALLOCATE 4
                                        MOVE TEMP 55 HALLOCATE 4
                                        HSTORE TEMP 55 0 Size_1_A_bar
                                        MOVE TEMP 56 4
                                        L6
                                        CJUMP LT TEMP 56 4 L7
                                        HSTORE PLUS TEMP 54 TEMP 56 0 0
                                        MOVE TEMP 56 PLUS TEMP 56 4
                                        JUMP L6
                                        L7
                                        HSTORE TEMP 54 0 TEMP 55
                                        RETURN TEMP 54
                                    END
                                HLOAD TEMP 57 TEMP 52 0
                                HLOAD TEMP 58 TEMP 57 0
                                RETURN
                                CALL TEMP 58
                                (
                                    TEMP 52
                                )
                            END
                        HLOAD TEMP 59 TEMP 51 0
                        HLOAD TEMP 60 TEMP 59 8
                        RETURN
                        CALL TEMP 60
                        (
                            TEMP 51
                        )
                    END
                HLOAD TEMP 61 TEMP 50 0
                HLOAD TEMP 62 TEMP 61 0
                RETURN
                CALL TEMP 62
                (
                    TEMP 50
                )
            END
        MOVE TEMP 31
            BEGIN
                MOVE TEMP 63
                    BEGIN
                        MOVE TEMP 64
                            BEGIN
                                MOVE TEMP 65
                                    BEGIN
                                        MOVE TEMP 67 HALLOCATE 4
                                        MOVE TEMP 68 HALLOCATE 4
                                        HSTORE TEMP 68 0 Size_1_A_bar
                                        MOVE TEMP 69 4
                                        L8
                                        CJUMP LT TEMP 69 4 L9
                                        HSTORE PLUS TEMP 67 TEMP 69 0 0
                                        MOVE TEMP 69 PLUS TEMP 69 4
                                        JUMP L8
                                        L9
                                        HSTORE TEMP 67 0 TEMP 68
                                        RETURN TEMP 67
                                    END
                                HLOAD TEMP 70 TEMP 65 0
                                HLOAD TEMP 71 TEMP 70 0
                                RETURN
                                CALL TEMP 71
                                (
                                    TEMP 65
                                )
                            END
                        HLOAD TEMP 72 TEMP 64 0
                        HLOAD TEMP 73 TEMP 72 8
                        RETURN
                        CALL TEMP 73
                        (
                            TEMP 64
                        )
                    END
                HLOAD TEMP 74 TEMP 63 0
                HLOAD TEMP 75 TEMP 74 0
                RETURN
                CALL TEMP 75
                (
                    TEMP 63
                )
            END
        MOVE TEMP 31
            BEGIN
                MOVE TEMP 76
                    BEGIN
                        MOVE TEMP 77
                            TEMP 0
                        HLOAD TEMP 78 TEMP 77 0
                        HLOAD TEMP 79 TEMP 78 8
                        RETURN
                        CALL TEMP 79
                        (
                            TEMP 77
                        )
                    END
                HLOAD TEMP 80 TEMP 76 0
                HLOAD TEMP 81 TEMP 80 0
                RETURN
                CALL TEMP 81
                (
                    TEMP 76
                )
            END
        MOVE TEMP 31
            BEGIN
                MOVE TEMP 82
                    BEGIN
                        MOVE TEMP 83
                            BEGIN
                                MOVE TEMP 84
                                    BEGIN
                                        RETURN TEMP 32
                                    END
                                HLOAD TEMP 85 TEMP 84 0
                                HLOAD TEMP 86 TEMP 85 0
                                RETURN
                                CALL TEMP 86
                                (
                                    TEMP 84
                                )
                            END
                        HLOAD TEMP 87 TEMP 83 0
                        HLOAD TEMP 88 TEMP 87 8
                        RETURN
                        CALL TEMP 88
                        (
                            TEMP 83
                        )
                    END
                HLOAD TEMP 89 TEMP 82 0
                HLOAD TEMP 90 TEMP 89 0
                RETURN
                CALL TEMP 90
                (
                    TEMP 82
                )
            END
        MOVE TEMP 91
        BEGIN
            MOVE TEMP 92
                BEGIN
                    MOVE TEMP 94 HALLOCATE 4
                    MOVE TEMP 95 HALLOCATE 12
                    HSTORE TEMP 95 0 Size_4_Test_f1
                    HSTORE TEMP 95 4 Size_4_Test_foo
                    HSTORE TEMP 95 8 Size_4_Test_f2
                    MOVE TEMP 96 4
                    L10
                    CJUMP LT TEMP 96 4 L11
                    HSTORE PLUS TEMP 94 TEMP 96 0 0
                    MOVE TEMP 96 PLUS TEMP 96 4
                    JUMP L10
                    L11
                    HSTORE TEMP 94 0 TEMP 95
                    RETURN TEMP 94
                END
            HLOAD TEMP 97 TEMP 92 0
            HLOAD TEMP 98 TEMP 97 0
            RETURN
            CALL TEMP 98
            (
                TEMP 92
            )
        END
        RETURN TEMP 91
    END
    Size_4_Test_f1 [ 0 ]
    BEGIN
        MOVE TEMP 99
        34
        RETURN TEMP 99
    END
    Size_4_Test_f2 [ 0 ]
    BEGIN
        MOVE TEMP 100
        BEGIN
            MOVE TEMP 102 HALLOCATE 4
            MOVE TEMP 103 HALLOCATE 12
            HSTORE TEMP 103 0 Size_4_Test_f1
            HSTORE TEMP 103 4 Size_4_Test_foo
            HSTORE TEMP 103 8 Size_4_Test_f2
            MOVE TEMP 104 4
            L12
            CJUMP LT TEMP 104 4 L13
            HSTORE PLUS TEMP 102 TEMP 104 0 0
            MOVE TEMP 104 PLUS TEMP 104 4
            JUMP L12
            L13
            HSTORE TEMP 102 0 TEMP 103
            RETURN TEMP 102
        END
        RETURN TEMP 100
    END
