MAIN
    PRINT 
    BEGIN
        MOVE TEMP 35
            BEGIN
                MOVE TEMP 37 HALLOCATE 4
                MOVE TEMP 38 HALLOCATE 4
                HSTORE TEMP 38 0 Size_4_Test_foo
                MOVE TEMP 39 4
                L0
                CJUMP LT TEMP 39 4 L1
                HSTORE PLUS TEMP 37 TEMP 39 0 0
                MOVE TEMP 39 PLUS TEMP 39 4
                JUMP L0
                L1
                HSTORE TEMP 37 0 TEMP 38
                RETURN TEMP 37
            END
        HLOAD TEMP 40 TEMP 35 0
        HLOAD TEMP 41 TEMP 40 0
        RETURN
        CALL TEMP 41
        (
            TEMP 35
            5
        )
    END
END
    Size_6_Parent_fn1 [ 1 ]
    BEGIN
        MOVE TEMP 42
        34
        RETURN TEMP 42
    END
    Size_6_Parent_fn2 [ 1 ]
    BEGIN
        MOVE TEMP 43
        BEGIN
            RETURN TEMP 1
        END
        RETURN TEMP 43
    END
    Size_5_Child_fn1 [ 1 ]
    BEGIN
        HSTORE TEMP 0 4
            23
        MOVE TEMP 44
        36
        RETURN TEMP 44
    END
    Size_5_Child_fn2 [ 1 ]
    BEGIN
        HSTORE TEMP 0 8
            0
        MOVE TEMP 45
        BEGIN
            RETURN TEMP 1
        END
        RETURN TEMP 45
    END
    Size_4_Test_foo [ 1 ]
    BEGIN
        MOVE TEMP 33
            BEGIN
                MOVE TEMP 47 HALLOCATE 8
                MOVE TEMP 48 HALLOCATE 8
                HSTORE TEMP 48 0 Size_6_Parent_fn2
                HSTORE TEMP 48 4 Size_6_Parent_fn1
                MOVE TEMP 49 4
                L2
                CJUMP LT TEMP 49 8 L3
                HSTORE PLUS TEMP 47 TEMP 49 0 0
                MOVE TEMP 49 PLUS TEMP 49 4
                JUMP L2
                L3
                HSTORE TEMP 47 0 TEMP 48
                RETURN TEMP 47
            END
        MOVE TEMP 34
            BEGIN
                MOVE TEMP 51 HALLOCATE 12
                MOVE TEMP 52 HALLOCATE 8
                HSTORE TEMP 52 0 Size_5_Child_fn2
                HSTORE TEMP 52 4 Size_5_Child_fn1
                MOVE TEMP 53 4
                L4
                CJUMP LT TEMP 53 12 L5
                HSTORE PLUS TEMP 51 TEMP 53 0 0
                MOVE TEMP 53 PLUS TEMP 53 4
                JUMP L4
                L5
                HSTORE TEMP 51 0 TEMP 52
                RETURN TEMP 51
            END
        MOVE TEMP 32
            BEGIN
                MOVE TEMP 54
                    BEGIN
                        RETURN TEMP 33
                    END
                HLOAD TEMP 55 TEMP 54 0
                HLOAD TEMP 56 TEMP 55 0
                RETURN
                CALL TEMP 56
                (
                    TEMP 54
                    1
                )
            END
        MOVE TEMP 32
            BEGIN
                MOVE TEMP 57
                    BEGIN
                        RETURN TEMP 34
                    END
                HLOAD TEMP 58 TEMP 57 0
                HLOAD TEMP 59 TEMP 58 0
                RETURN
                CALL TEMP 59
                (
                    TEMP 57
                    0
                )
            END
        MOVE TEMP 33
            BEGIN
                RETURN TEMP 34
            END
        MOVE TEMP 33
            BEGIN
                MOVE TEMP 61 HALLOCATE 12
                MOVE TEMP 62 HALLOCATE 8
                HSTORE TEMP 62 0 Size_5_Child_fn2
                HSTORE TEMP 62 4 Size_5_Child_fn1
                MOVE TEMP 63 4
                L6
                CJUMP LT TEMP 63 12 L7
                HSTORE PLUS TEMP 61 TEMP 63 0 0
                MOVE TEMP 63 PLUS TEMP 63 4
                JUMP L6
                L7
                HSTORE TEMP 61 0 TEMP 62
                RETURN TEMP 61
            END
        MOVE TEMP 31
            BEGIN
                MOVE TEMP 64
                    BEGIN
                        RETURN TEMP 33
                    END
                HLOAD TEMP 65 TEMP 64 0
                HLOAD TEMP 66 TEMP 65 4
                RETURN
                CALL TEMP 66
                (
                    TEMP 64
                    1
                )
            END
        MOVE TEMP 67
        67
        RETURN TEMP 67
    END
