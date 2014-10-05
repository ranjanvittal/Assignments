MAIN
    PRINT 
    BEGIN
        MOVE TEMP 33
            BEGIN
                MOVE TEMP 35 HALLOCATE 4
                MOVE TEMP 36 HALLOCATE 8
                HSTORE TEMP 36 0 Size_4_Test_foo
                HSTORE TEMP 36 4 Size_4_Test_bar
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
            10
        )
    END
END
    Size_4_Test_bar [ 1 ]
    BEGIN
        CJUMP
            LT
                BEGIN
                    RETURN TEMP 1
                END
                0
            L2
            MOVE TEMP 32
                0
            JUMP L3
            L2 NOOP
            MOVE TEMP 32
                BEGIN
                    MOVE TEMP 40
                        TEMP 0
                    HLOAD TEMP 41 TEMP 40 0
                    HLOAD TEMP 42 TEMP 41 0
                    RETURN
                    CALL TEMP 42
                    (
                        TEMP 40
                        MINUS
                            BEGIN
                                RETURN TEMP 1
                            END
                            1
                    )
                END
            L3
            NOOP
        MOVE TEMP 43
        BEGIN
            RETURN TEMP 32
        END
        RETURN TEMP 43
    END
    Size_4_Test_foo [ 1 ]
    BEGIN
        CJUMP
            LT
                BEGIN
                    RETURN TEMP 1
                END
                0
            L4
            MOVE TEMP 31
                0
            JUMP L5
            L4 NOOP
            MOVE TEMP 31
                BEGIN
                    MOVE TEMP 44
                        TEMP 0
                    HLOAD TEMP 45 TEMP 44 0
                    HLOAD TEMP 46 TEMP 45 4
                    RETURN
                    CALL TEMP 46
                    (
                        TEMP 44
                        MINUS
                            BEGIN
                                RETURN TEMP 1
                            END
                            1
                    )
                END
            L5
            NOOP
        MOVE TEMP 47
        BEGIN
            RETURN TEMP 31
        END
        RETURN TEMP 47
    END
