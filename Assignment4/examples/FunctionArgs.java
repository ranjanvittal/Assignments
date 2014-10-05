MAIN
    PRINT 
    BEGIN
        MOVE TEMP 33
            BEGIN
                MOVE TEMP 35 HALLOCATE 4
                MOVE TEMP 36 HALLOCATE 4
                HSTORE TEMP 36 0 Size_4_Test_foo
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
        HLOAD TEMP 39 TEMP 38 0
        RETURN
        CALL TEMP 39
        (
            TEMP 33
            10
            0
        )
    END
END
    Size_4_Test_foo [ 2 ]
    BEGIN
        MOVE TEMP 32
            BEGIN
                MOVE TEMP 41 HALLOCATE 4
                MOVE TEMP 42 HALLOCATE 4
                HSTORE TEMP 42 0 Size_1_A_bar
                MOVE TEMP 43 4
                L2
                CJUMP LT TEMP 43 4 L3
                HSTORE PLUS TEMP 41 TEMP 43 0 0
                MOVE TEMP 43 PLUS TEMP 43 4
                JUMP L2
                L3
                HSTORE TEMP 41 0 TEMP 42
                RETURN TEMP 41
            END
        MOVE TEMP 31
            BEGIN
            MOVE TEMP 45
            34
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
        MOVE TEMP 31
            BEGIN
                MOVE TEMP 48
                    BEGIN
                        RETURN TEMP 32
                    END
                HLOAD TEMP 49 TEMP 48 0
                HLOAD TEMP 50 TEMP 49 0
                RETURN
                CALL TEMP 50
                (
                    TEMP 48
                    BEGIN
                        RETURN TEMP 31
                    END
                    BEGIN
                        MOVE TEMP 52 HALLOCATE 4
                        MOVE TEMP 53 HALLOCATE 4
                        HSTORE TEMP 53 0 Size_1_A_bar
                        MOVE TEMP 54 4
                        L6
                        CJUMP LT TEMP 54 4 L7
                        HSTORE PLUS TEMP 52 TEMP 54 0 0
                        MOVE TEMP 54 PLUS TEMP 54 4
                        JUMP L6
                        L7
                        HSTORE TEMP 52 0 TEMP 53
                        RETURN TEMP 52
                    END
                )
            END
        MOVE TEMP 55
        78
        RETURN TEMP 55
    END
    Size_1_A_bar [ 2 ]
    BEGIN
        MOVE TEMP 56
        BEGIN
            RETURN TEMP 1
        END
        RETURN TEMP 56
    END
