MAIN
    PRINT 
    BEGIN
        MOVE TEMP 33
            BEGIN
                MOVE TEMP 35 HALLOCATE 4
                MOVE TEMP 36 HALLOCATE 16
                HSTORE TEMP 36 0 Size_4_Test_f1
                HSTORE TEMP 36 4 Size_4_Test_foo
                HSTORE TEMP 36 8 Size_4_Test_f3
                HSTORE TEMP 36 12 Size_4_Test_f2
                MOVE TEMP 37 4
                L0
                CJUMP LT TEMP 37 4 L1
                HSTORE PLUS TEMP 35 TEMP 37 0 0
                MOVE TEMP 37 PLUS TEMP 37 4
                JUMP L0
                L1
                HSTORE TEMP 35 0 TEMP 36
                RETURN TEMP 35
            END
        HLOAD TEMP 38 TEMP 33 0
        HLOAD TEMP 39 TEMP 38 4
        RETURN
        CALL TEMP 39
        (
            TEMP 33
            5
        )
    END
END
    Size_1_A_bar [ 1 ]
    BEGIN
        MOVE TEMP 40
        BEGIN
            MOVE TEMP 42 HALLOCATE 4
            MOVE TEMP 43 HALLOCATE 16
            HSTORE TEMP 43 0 Size_4_Test_f1
            HSTORE TEMP 43 4 Size_4_Test_foo
            HSTORE TEMP 43 8 Size_4_Test_f3
            HSTORE TEMP 43 12 Size_4_Test_f2
            MOVE TEMP 44 4
            L2
            CJUMP LT TEMP 44 4 L3
            HSTORE PLUS TEMP 42 TEMP 44 0 0
            MOVE TEMP 44 PLUS TEMP 44 4
            JUMP L2
            L3
            HSTORE TEMP 42 0 TEMP 43
            RETURN TEMP 42
        END
        RETURN TEMP 40
    END
    Size_1_A_f1 [ 0 ]
    BEGIN
        MOVE TEMP 45
        1
        RETURN TEMP 45
    END
    Size_1_A_f3 [ 1 ]
    BEGIN
        MOVE TEMP 46
        0
        RETURN TEMP 46
    END
    Size_1_A_f4 [ 1 ]
    BEGIN
        MOVE TEMP 47
        BEGIN
            MOVE TEMP 49 HALLOCATE 4
            MOVE TEMP 50 HALLOCATE 16
            HSTORE TEMP 50 0 Size_1_A_f1
            HSTORE TEMP 50 4 Size_1_A_f3
            HSTORE TEMP 50 8 Size_1_A_bar
            HSTORE TEMP 50 12 Size_1_A_f4
            MOVE TEMP 51 4
            L4
            CJUMP LT TEMP 51 4 L5
            HSTORE PLUS TEMP 49 TEMP 51 0 0
            MOVE TEMP 51 PLUS TEMP 51 4
            JUMP L4
            L5
            HSTORE TEMP 49 0 TEMP 50
            RETURN TEMP 49
        END
        RETURN TEMP 47
    END
    Size_4_Test_foo [ 1 ]
    BEGIN
        MOVE TEMP 31
            TEMP 0
        MOVE TEMP 32
            BEGIN
                MOVE TEMP 53 HALLOCATE 4
                MOVE TEMP 54 HALLOCATE 16
                HSTORE TEMP 54 0 Size_1_A_f1
                HSTORE TEMP 54 4 Size_1_A_f3
                HSTORE TEMP 54 8 Size_1_A_bar
                HSTORE TEMP 54 12 Size_1_A_f4
                MOVE TEMP 55 4
                L6
                CJUMP LT TEMP 55 4 L7
                HSTORE PLUS TEMP 53 TEMP 55 0 0
                MOVE TEMP 55 PLUS TEMP 55 4
                JUMP L6
                L7
                HSTORE TEMP 53 0 TEMP 54
                RETURN TEMP 53
            END
        MOVE TEMP 31
            BEGIN
                MOVE TEMP 56
                    BEGIN
                        MOVE TEMP 57
                            BEGIN
                                RETURN TEMP 32
                            END
                        HLOAD TEMP 58 TEMP 57 0
                        HLOAD TEMP 59 TEMP 58 12
                        RETURN
                        CALL TEMP 59
                        (
                            TEMP 57
                            BEGIN
                                MOVE TEMP 60
                                    TEMP 0
                                HLOAD TEMP 61 TEMP 60 0
                                HLOAD TEMP 62 TEMP 61 0
                                RETURN
                                CALL TEMP 62
                                (
                                    TEMP 60
                                    BEGIN
                                        MOVE TEMP 63
                                            BEGIN
                                                RETURN TEMP 32
                                            END
                                        HLOAD TEMP 64 TEMP 63 0
                                        HLOAD TEMP 65 TEMP 64 8
                                        RETURN
                                        CALL TEMP 65
                                        (
                                            TEMP 63
                                            BEGIN
                                                MOVE TEMP 66
                                                    BEGIN
                                                        RETURN TEMP 32
                                                    END
                                                HLOAD TEMP 67 TEMP 66 0
                                                HLOAD TEMP 68 TEMP 67 4
                                                RETURN
                                                CALL TEMP 68
                                                (
                                                    TEMP 66
                                                    BEGIN
                                                        MOVE TEMP 69
                                                            TEMP 0
                                                        HLOAD TEMP 70 TEMP 69 0
                                                        HLOAD TEMP 71 TEMP 70 8
                                                        RETURN
                                                        CALL TEMP 71
                                                        (
                                                            TEMP 69
                                                            BEGIN
                                                                MOVE TEMP 72
                                                                    TEMP 0
                                                                HLOAD TEMP 73 TEMP 72 0
                                                                HLOAD TEMP 74 TEMP 73 0
                                                                RETURN
                                                                CALL TEMP 74
                                                                (
                                                                    TEMP 72
                                                                    BEGIN
                                                                        RETURN TEMP 31
                                                                    END
                                                                )
                                                            END
                                                        )
                                                    END
                                                )
                                            END
                                        )
                                    END
                                )
                            END
                        )
                    END
                HLOAD TEMP 75 TEMP 56 0
                HLOAD TEMP 76 TEMP 75 8
                RETURN
                CALL TEMP 76
                (
                    TEMP 56
                    BEGIN
                        MOVE TEMP 77
                            BEGIN
                                RETURN TEMP 32
                            END
                        HLOAD TEMP 78 TEMP 77 0
                        HLOAD TEMP 79 TEMP 78 4
                        RETURN
                        CALL TEMP 79
                        (
                            TEMP 77
                            BEGIN
                                MOVE TEMP 80
                                    TEMP 0
                                HLOAD TEMP 81 TEMP 80 0
                                HLOAD TEMP 82 TEMP 81 8
                                RETURN
                                CALL TEMP 82
                                (
                                    TEMP 80
                                    BEGIN
                                    MOVE TEMP 84
                                    5
                                        MOVE TEMP 85 HALLOCATE TIMES 4 PLUS 1 TEMP 84
                                        HSTORE TEMP 85 0 TEMP 84
                                        MOVE TEMP 86 4
                                        L8
                                        CJUMP LT TEMP 86 TIMES 4 PLUS 1 TEMP 84 L9
                                        HSTORE PLUS TEMP 85 TEMP 86 0 0
                                        MOVE TEMP 86 PLUS TEMP 86 4
                                        JUMP L8
                                        L9 NOOP
                                        RETURN TEMP 85
                                    END
                                )
                            END
                        )
                    END
                )
            END
        MOVE TEMP 87
        0
        RETURN TEMP 87
    END
    Size_4_Test_f1 [ 1 ]
    BEGIN
        MOVE TEMP 88
        BEGIN
        MOVE TEMP 90
        34
            MOVE TEMP 91 HALLOCATE TIMES 4 PLUS 1 TEMP 90
            HSTORE TEMP 91 0 TEMP 90
            MOVE TEMP 92 4
            L10
            CJUMP LT TEMP 92 TIMES 4 PLUS 1 TEMP 90 L11
            HSTORE PLUS TEMP 91 TEMP 92 0 0
            MOVE TEMP 92 PLUS TEMP 92 4
            JUMP L10
            L11 NOOP
            RETURN TEMP 91
        END
        RETURN TEMP 88
    END
    Size_4_Test_f2 [ 1 ]
    BEGIN
        MOVE TEMP 93
        BEGIN
            MOVE TEMP 95 HALLOCATE 4
            MOVE TEMP 96 HALLOCATE 16
            HSTORE TEMP 96 0 Size_4_Test_f1
            HSTORE TEMP 96 4 Size_4_Test_foo
            HSTORE TEMP 96 8 Size_4_Test_f3
            HSTORE TEMP 96 12 Size_4_Test_f2
            MOVE TEMP 97 4
            L12
            CJUMP LT TEMP 97 4 L13
            HSTORE PLUS TEMP 95 TEMP 97 0 0
            MOVE TEMP 97 PLUS TEMP 97 4
            JUMP L12
            L13
            HSTORE TEMP 95 0 TEMP 96
            RETURN TEMP 95
        END
        RETURN TEMP 93
    END
    Size_4_Test_f3 [ 1 ]
    BEGIN
        MOVE TEMP 98
        0
        RETURN TEMP 98
    END
