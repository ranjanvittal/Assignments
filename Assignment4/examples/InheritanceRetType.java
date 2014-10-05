MAIN
    PRINT 
    BEGIN
        MOVE TEMP 36
            BEGIN
                MOVE TEMP 38 HALLOCATE 4
                MOVE TEMP 39 HALLOCATE 4
                HSTORE TEMP 39 0 Size_4_Test_foo
                MOVE TEMP 40 4
                L0
                CJUMP LT TEMP 40 4 L1
                HSTORE PLUS TEMP 38 TEMP 40 0 0
                MOVE TEMP 40 PLUS TEMP 40 4
                JUMP L0
                L1
                HSTORE TEMP 38 0 TEMP 39
                RETURN TEMP 38
            END
        HLOAD TEMP 41 TEMP 36 0
        HLOAD TEMP 42 TEMP 41 0
        RETURN
        CALL TEMP 42
        (
            TEMP 36
            5
        )
    END
END
    Size_6_Parent_fn1 [ 1 ]
    BEGIN
        MOVE TEMP 43
        BEGIN
            MOVE TEMP 45 HALLOCATE 4
            MOVE TEMP 46 HALLOCATE 0
            MOVE TEMP 47 4
            L2
            CJUMP LT TEMP 47 4 L3
            HSTORE PLUS TEMP 45 TEMP 47 0 0
            MOVE TEMP 47 PLUS TEMP 47 4
            JUMP L2
            L3
            HSTORE TEMP 45 0 TEMP 46
            RETURN TEMP 45
        END
        RETURN TEMP 43
    END
    Size_5_Child_fn1 [ 1 ]
    BEGIN
        MOVE TEMP 48
        BEGIN
            MOVE TEMP 50 HALLOCATE 4
            MOVE TEMP 51 HALLOCATE 0
            MOVE TEMP 52 4
            L4
            CJUMP LT TEMP 52 4 L5
            HSTORE PLUS TEMP 50 TEMP 52 0 0
            MOVE TEMP 52 PLUS TEMP 52 4
            JUMP L4
            L5
            HSTORE TEMP 50 0 TEMP 51
            RETURN TEMP 50
        END
        RETURN TEMP 48
    END
    Size_4_Test_foo [ 1 ]
    BEGIN
        MOVE TEMP 33
            BEGIN
                MOVE TEMP 54 HALLOCATE 8
                MOVE TEMP 55 HALLOCATE 4
                HSTORE TEMP 55 0 Size_6_Parent_fn1
                MOVE TEMP 56 4
                L6
                CJUMP LT TEMP 56 8 L7
                HSTORE PLUS TEMP 54 TEMP 56 0 0
                MOVE TEMP 56 PLUS TEMP 56 4
                JUMP L6
                L7
                HSTORE TEMP 54 0 TEMP 55
                RETURN TEMP 54
            END
        MOVE TEMP 35
            BEGIN
                MOVE TEMP 58 HALLOCATE 12
                MOVE TEMP 59 HALLOCATE 4
                HSTORE TEMP 59 0 Size_5_Child_fn1
                MOVE TEMP 60 4
                L8
                CJUMP LT TEMP 60 12 L9
                HSTORE PLUS TEMP 58 TEMP 60 0 0
                MOVE TEMP 60 PLUS TEMP 60 4
                JUMP L8
                L9
                HSTORE TEMP 58 0 TEMP 59
                RETURN TEMP 58
            END
        MOVE TEMP 33
            BEGIN
                RETURN TEMP 35
            END
        MOVE TEMP 33
            BEGIN
                MOVE TEMP 62 HALLOCATE 12
                MOVE TEMP 63 HALLOCATE 4
                HSTORE TEMP 63 0 Size_5_Child_fn1
                MOVE TEMP 64 4
                L10
                CJUMP LT TEMP 64 12 L11
                HSTORE PLUS TEMP 62 TEMP 64 0 0
                MOVE TEMP 64 PLUS TEMP 64 4
                JUMP L10
                L11
                HSTORE TEMP 62 0 TEMP 63
                RETURN TEMP 62
            END
        MOVE TEMP 34
            BEGIN
                MOVE TEMP 65
                    BEGIN
                        RETURN TEMP 33
                    END
                HLOAD TEMP 66 TEMP 65 0
                HLOAD TEMP 67 TEMP 66 0
                RETURN
                CALL TEMP 67
                (
                    TEMP 65
                    1
                )
            END
        MOVE TEMP 68
        67
        RETURN TEMP 68
    END
