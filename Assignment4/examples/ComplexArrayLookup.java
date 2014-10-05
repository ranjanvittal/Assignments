MAIN
    PRINT 
    BEGIN
        MOVE TEMP 34
            BEGIN
                MOVE TEMP 36 HALLOCATE 4
                MOVE TEMP 37 HALLOCATE 12
                HSTORE TEMP 37 0 Size_4_Test_f1
                HSTORE TEMP 37 4 Size_4_Test_foo
                HSTORE TEMP 37 8 Size_4_Test_bar
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
            2
            4
        )
    END
END
    Size_4_Test_foo [ 2 ]
    BEGIN
        MOVE TEMP 31
            BEGIN
            MOVE TEMP 42
            BEGIN
                RETURN TEMP 2
            END
                MOVE TEMP 43 HALLOCATE TIMES 4 PLUS 1 TEMP 42
                HSTORE TEMP 43 0 TEMP 42
                MOVE TEMP 44 4
                L2
                CJUMP LT TEMP 44 TIMES 4 PLUS 1 TEMP 42 L3
                HSTORE PLUS TEMP 43 TEMP 44 0 0
                MOVE TEMP 44 PLUS TEMP 44 4
                JUMP L2
                L3 NOOP
                RETURN TEMP 43
            END
        MOVE TEMP 32
            BEGIN
                MOVE TEMP 45
                    TEMP 0
                HLOAD TEMP 46 TEMP 45 0
                HLOAD TEMP 47 TEMP 46 8
                RETURN
                CALL TEMP 47
                (
                    TEMP 45
                )
            END
        MOVE TEMP 33
            BEGIN
                MOVE TEMP 48
                BEGIN
                    RETURN TEMP 31
                END
                MOVE TEMP 49
                3
                MOVE TEMP 49 TIMES 4 TEMP 49
                HLOAD TEMP 51 TEMP 48 0
                CJUMP MINUS 1 LT TEMP 49 TIMES 4 TEMP 51 L4
                    ERROR
                L4
                NOOP
                MOVE TEMP 48 PLUS 4 PLUS TEMP 49 TEMP 48
                HLOAD TEMP 50 TEMP 48 0
                RETURN TEMP 50
            END
        MOVE TEMP 33
            BEGIN
                MOVE TEMP 52
                BEGIN
                    RETURN TEMP 31
                END
                MOVE TEMP 53
                BEGIN
                    MOVE TEMP 56
                    BEGIN
                        RETURN TEMP 32
                    END
                    MOVE TEMP 57
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
                                    RETURN TEMP 31
                                END
                                MOVE TEMP 64
                                0
                                MOVE TEMP 64 TIMES 4 TEMP 64
                                HLOAD TEMP 66 TEMP 63 0
                                CJUMP MINUS 1 LT TEMP 64 TIMES 4 TEMP 66 L7
                                    ERROR
                                L7
                                NOOP
                                MOVE TEMP 63 PLUS 4 PLUS TEMP 64 TEMP 63
                                HLOAD TEMP 65 TEMP 63 0
                                RETURN TEMP 65
                            END
                        )
                    END
                    MOVE TEMP 57 TIMES 4 TEMP 57
                    HLOAD TEMP 59 TEMP 56 0
                    CJUMP MINUS 1 LT TEMP 57 TIMES 4 TEMP 59 L6
                        ERROR
                    L6
                    NOOP
                    MOVE TEMP 56 PLUS 4 PLUS TEMP 57 TEMP 56
                    HLOAD TEMP 58 TEMP 56 0
                    RETURN TEMP 58
                END
                MOVE TEMP 53 TIMES 4 TEMP 53
                HLOAD TEMP 55 TEMP 52 0
                CJUMP MINUS 1 LT TEMP 53 TIMES 4 TEMP 55 L5
                    ERROR
                L5
                NOOP
                MOVE TEMP 52 PLUS 4 PLUS TEMP 53 TEMP 52
                HLOAD TEMP 54 TEMP 52 0
                RETURN TEMP 54
            END
        MOVE TEMP 67
        BEGIN
            RETURN TEMP 33
        END
        RETURN TEMP 67
    END
    Size_4_Test_bar [ 0 ]
    BEGIN
        MOVE TEMP 68
        BEGIN
        MOVE TEMP 70
        20
            MOVE TEMP 71 HALLOCATE TIMES 4 PLUS 1 TEMP 70
            HSTORE TEMP 71 0 TEMP 70
            MOVE TEMP 72 4
            L8
            CJUMP LT TEMP 72 TIMES 4 PLUS 1 TEMP 70 L9
            HSTORE PLUS TEMP 71 TEMP 72 0 0
            MOVE TEMP 72 PLUS TEMP 72 4
            JUMP L8
            L9 NOOP
            RETURN TEMP 71
        END
        RETURN TEMP 68
    END
    Size_4_Test_f1 [ 1 ]
    BEGIN
        MOVE TEMP 73
        0
        RETURN TEMP 73
    END
