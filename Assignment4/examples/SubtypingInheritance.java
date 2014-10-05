MAIN
    PRINT 
    BEGIN
        MOVE TEMP 39
            BEGIN
                MOVE TEMP 41 HALLOCATE 4
                MOVE TEMP 42 HALLOCATE 4
                HSTORE TEMP 42 0 Size_4_Test_foo
                MOVE TEMP 43 4
                L0
                CJUMP LT TEMP 43 4 L1
                HSTORE PLUS TEMP 41 TEMP 43 0 0
                MOVE TEMP 43 PLUS TEMP 43 4
                JUMP L0
                L1
                HSTORE TEMP 41 0 TEMP 42
                RETURN TEMP 41
            END
        HLOAD TEMP 44 TEMP 39 0
        HLOAD TEMP 45 TEMP 44 0
        RETURN
        CALL TEMP 45
        (
            TEMP 39
            5
        )
    END
END
    Size_6_Parent_bar [ 0 ]
    BEGIN
        MOVE TEMP 46
        12
        RETURN TEMP 46
    END
    Size_5_Child_bar [ 0 ]
    BEGIN
        MOVE TEMP 47
        16
        RETURN TEMP 47
    END
    Size_7_Parent3_fn1 [ 1 ]
    BEGIN
        MOVE TEMP 37
            BEGIN
                MOVE TEMP 49 HALLOCATE 4
                MOVE TEMP 50 HALLOCATE 4
                HSTORE TEMP 50 0 Size_5_Child_bar
                MOVE TEMP 51 4
                L2
                CJUMP LT TEMP 51 4 L3
                HSTORE PLUS TEMP 49 TEMP 51 0 0
                MOVE TEMP 51 PLUS TEMP 51 4
                JUMP L2
                L3
                HSTORE TEMP 49 0 TEMP 50
                RETURN TEMP 49
            END
        MOVE TEMP 52
        BEGIN
            RETURN TEMP 37
        END
        RETURN TEMP 52
    END
    Size_7_Parent3_fn2 [ 1 ]
    BEGIN
        MOVE TEMP 53
        BEGIN
            RETURN TEMP 1
        END
        RETURN TEMP 53
    END
    Size_6_Child3_fn1 [ 1 ]
    BEGIN
        MOVE TEMP 54
        BEGIN
            MOVE TEMP 56 HALLOCATE 4
            MOVE TEMP 57 HALLOCATE 4
            HSTORE TEMP 57 0 Size_5_Child_bar
            MOVE TEMP 58 4
            L4
            CJUMP LT TEMP 58 4 L5
            HSTORE PLUS TEMP 56 TEMP 58 0 0
            MOVE TEMP 58 PLUS TEMP 58 4
            JUMP L4
            L5
            HSTORE TEMP 56 0 TEMP 57
            RETURN TEMP 56
        END
        RETURN TEMP 54
    END
    Size_6_Child3_fn3 [ 1 ]
    BEGIN
        MOVE TEMP 38
            0
        MOVE TEMP 59
        BEGIN
            MOVE TEMP 61 HALLOCATE 4
            MOVE TEMP 62 HALLOCATE 0
            MOVE TEMP 63 4
            L6
            CJUMP LT TEMP 63 4 L7
            HSTORE PLUS TEMP 61 TEMP 63 0 0
            MOVE TEMP 63 PLUS TEMP 63 4
            JUMP L6
            L7
            HSTORE TEMP 61 0 TEMP 62
            RETURN TEMP 61
        END
        RETURN TEMP 59
    END
    Size_4_Test_foo [ 1 ]
    BEGIN
        MOVE TEMP 33
            BEGIN
                MOVE TEMP 65 HALLOCATE 4
                MOVE TEMP 66 HALLOCATE 0
                MOVE TEMP 67 4
                L8
                CJUMP LT TEMP 67 4 L9
                HSTORE PLUS TEMP 65 TEMP 67 0 0
                MOVE TEMP 67 PLUS TEMP 67 4
                JUMP L8
                L9
                HSTORE TEMP 65 0 TEMP 66
                RETURN TEMP 65
            END
        MOVE TEMP 31
            BEGIN
                MOVE TEMP 69 HALLOCATE 12
                MOVE TEMP 70 HALLOCATE 12
                HSTORE TEMP 70 0 Size_7_Parent3_fn2
                HSTORE TEMP 70 4 Size_6_Child3_fn1
                HSTORE TEMP 70 8 Size_6_Child3_fn3
                MOVE TEMP 71 4
                L10
                CJUMP LT TEMP 71 12 L11
                HSTORE PLUS TEMP 69 TEMP 71 0 0
                MOVE TEMP 71 PLUS TEMP 71 4
                JUMP L10
                L11
                HSTORE TEMP 69 0 TEMP 70
                RETURN TEMP 69
            END
        MOVE TEMP 34
            BEGIN
                MOVE TEMP 72
                    BEGIN
                        RETURN TEMP 31
                    END
                HLOAD TEMP 73 TEMP 72 0
                HLOAD TEMP 74 TEMP 73 4
                RETURN
                CALL TEMP 74
                (
                    TEMP 72
                    BEGIN
                        RETURN TEMP 33
                    END
                )
            END
        MOVE TEMP 34
            BEGIN
                MOVE TEMP 75
                    BEGIN
                        RETURN TEMP 31
                    END
                HLOAD TEMP 76 TEMP 75 0
                HLOAD TEMP 77 TEMP 76 4
                RETURN
                CALL TEMP 77
                (
                    TEMP 75
                    BEGIN
                        MOVE TEMP 79 HALLOCATE 4
                        MOVE TEMP 80 HALLOCATE 0
                        MOVE TEMP 81 4
                        L12
                        CJUMP LT TEMP 81 4 L13
                        HSTORE PLUS TEMP 79 TEMP 81 0 0
                        MOVE TEMP 81 PLUS TEMP 81 4
                        JUMP L12
                        L13
                        HSTORE TEMP 79 0 TEMP 80
                        RETURN TEMP 79
                    END
                )
            END
        MOVE TEMP 33
            BEGIN
                MOVE TEMP 82
                    BEGIN
                        RETURN TEMP 31
                    END
                HLOAD TEMP 83 TEMP 82 0
                HLOAD TEMP 84 TEMP 83 0
                RETURN
                CALL TEMP 84
                (
                    TEMP 82
                    BEGIN
                        MOVE TEMP 86 HALLOCATE 4
                        MOVE TEMP 87 HALLOCATE 0
                        MOVE TEMP 88 4
                        L14
                        CJUMP LT TEMP 88 4 L15
                        HSTORE PLUS TEMP 86 TEMP 88 0 0
                        MOVE TEMP 88 PLUS TEMP 88 4
                        JUMP L14
                        L15
                        HSTORE TEMP 86 0 TEMP 87
                        RETURN TEMP 86
                    END
                )
            END
        MOVE TEMP 35
            BEGIN
                MOVE TEMP 90 HALLOCATE 12
                MOVE TEMP 91 HALLOCATE 12
                HSTORE TEMP 91 0 Size_7_Parent3_fn2
                HSTORE TEMP 91 4 Size_6_Child3_fn1
                HSTORE TEMP 91 8 Size_6_Child3_fn3
                MOVE TEMP 92 4
                L16
                CJUMP LT TEMP 92 12 L17
                HSTORE PLUS TEMP 90 TEMP 92 0 0
                MOVE TEMP 92 PLUS TEMP 92 4
                JUMP L16
                L17
                HSTORE TEMP 90 0 TEMP 91
                RETURN TEMP 90
            END
        MOVE TEMP 33
            BEGIN
                MOVE TEMP 93
                    BEGIN
                        RETURN TEMP 35
                    END
                HLOAD TEMP 94 TEMP 93 0
                HLOAD TEMP 95 TEMP 94 8
                RETURN
                CALL TEMP 95
                (
                    TEMP 93
                    BEGIN
                        MOVE TEMP 97 HALLOCATE 4
                        MOVE TEMP 98 HALLOCATE 0
                        MOVE TEMP 99 4
                        L18
                        CJUMP LT TEMP 99 4 L19
                        HSTORE PLUS TEMP 97 TEMP 99 0 0
                        MOVE TEMP 99 PLUS TEMP 99 4
                        JUMP L18
                        L19
                        HSTORE TEMP 97 0 TEMP 98
                        RETURN TEMP 97
                    END
                )
            END
        MOVE TEMP 32
            BEGIN
                MOVE TEMP 100
                    BEGIN
                        RETURN TEMP 35
                    END
                HLOAD TEMP 101 TEMP 100 0
                HLOAD TEMP 102 TEMP 101 4
                RETURN
                CALL TEMP 102
                (
                    TEMP 100
                    BEGIN
                        MOVE TEMP 104 HALLOCATE 4
                        MOVE TEMP 105 HALLOCATE 0
                        MOVE TEMP 106 4
                        L20
                        CJUMP LT TEMP 106 4 L21
                        HSTORE PLUS TEMP 104 TEMP 106 0 0
                        MOVE TEMP 106 PLUS TEMP 106 4
                        JUMP L20
                        L21
                        HSTORE TEMP 104 0 TEMP 105
                        RETURN TEMP 104
                    END
                )
            END
        MOVE TEMP 31
            BEGIN
                MOVE TEMP 108 HALLOCATE 8
                MOVE TEMP 109 HALLOCATE 8
                HSTORE TEMP 109 0 Size_7_Parent3_fn2
                HSTORE TEMP 109 4 Size_7_Parent3_fn1
                MOVE TEMP 110 4
                L22
                CJUMP LT TEMP 110 8 L23
                HSTORE PLUS TEMP 108 TEMP 110 0 0
                MOVE TEMP 110 PLUS TEMP 110 4
                JUMP L22
                L23
                HSTORE TEMP 108 0 TEMP 109
                RETURN TEMP 108
            END
        MOVE TEMP 34
            BEGIN
                MOVE TEMP 111
                    BEGIN
                        RETURN TEMP 31
                    END
                HLOAD TEMP 112 TEMP 111 0
                HLOAD TEMP 113 TEMP 112 4
                RETURN
                CALL TEMP 113
                (
                    TEMP 111
                    BEGIN
                        RETURN TEMP 33
                    END
                )
            END
        MOVE TEMP 114
        67
        RETURN TEMP 114
    END
