MAIN
    PRINT 
    BEGIN
        MOVE TEMP 60
            BEGIN
                MOVE TEMP 62 HALLOCATE 4
                MOVE TEMP 63 HALLOCATE 4
                HSTORE TEMP 63 0 Size_2_BT_Start
                MOVE TEMP 64 4
                L0
                CJUMP LT TEMP 64 4 L1
                HSTORE PLUS TEMP 62 TEMP 64 0 0
                MOVE TEMP 64 PLUS TEMP 64 4
                JUMP L0
                L1
                HSTORE TEMP 62 0 TEMP 63
                RETURN TEMP 62
            END
        HLOAD TEMP 65 TEMP 60 0
        HLOAD TEMP 66 TEMP 65 0
        RETURN
        CALL TEMP 66
        (
            TEMP 60
        )
    END
END
    Size_2_BT_Start [ 0 ]
    BEGIN
        MOVE TEMP 58
            BEGIN
                MOVE TEMP 68 HALLOCATE 28
                MOVE TEMP 69 HALLOCATE 80
                HSTORE TEMP 69 0 Size_4_Tree_GetRight
                HSTORE TEMP 69 4 Size_4_Tree_GetLeft
                HSTORE TEMP 69 8 Size_4_Tree_Search
                HSTORE TEMP 69 12 Size_4_Tree_RemoveRight
                HSTORE TEMP 69 16 Size_4_Tree_Insert
                HSTORE TEMP 69 20 Size_4_Tree_SetLeft
                HSTORE TEMP 69 24 Size_4_Tree_Compare
                HSTORE TEMP 69 28 Size_4_Tree_Print
                HSTORE TEMP 69 32 Size_4_Tree_GetHas_Left
                HSTORE TEMP 69 36 Size_4_Tree_RemoveLeft
                HSTORE TEMP 69 40 Size_4_Tree_SetHas_Left
                HSTORE TEMP 69 44 Size_4_Tree_GetHas_Right
                HSTORE TEMP 69 48 Size_4_Tree_GetKey
                HSTORE TEMP 69 52 Size_4_Tree_Init
                HSTORE TEMP 69 56 Size_4_Tree_SetKey
                HSTORE TEMP 69 60 Size_4_Tree_RecPrint
                HSTORE TEMP 69 64 Size_4_Tree_Remove
                HSTORE TEMP 69 68 Size_4_Tree_Delete
                HSTORE TEMP 69 72 Size_4_Tree_SetRight
                HSTORE TEMP 69 76 Size_4_Tree_SetHas_Right
                MOVE TEMP 70 4
                L2
                CJUMP LT TEMP 70 28 L3
                HSTORE PLUS TEMP 68 TEMP 70 0 0
                MOVE TEMP 70 PLUS TEMP 70 4
                JUMP L2
                L3
                HSTORE TEMP 68 0 TEMP 69
                RETURN TEMP 68
            END
        MOVE TEMP 57
            BEGIN
                MOVE TEMP 71
                    BEGIN
                        RETURN TEMP 58
                    END
                HLOAD TEMP 72 TEMP 71 0
                HLOAD TEMP 73 TEMP 72 52
                RETURN
                CALL TEMP 73
                (
                    TEMP 71
                    16
                )
            END
        MOVE TEMP 57
            BEGIN
                MOVE TEMP 74
                    BEGIN
                        RETURN TEMP 58
                    END
                HLOAD TEMP 75 TEMP 74 0
                HLOAD TEMP 76 TEMP 75 28
                RETURN
                CALL TEMP 76
                (
                    TEMP 74
                )
            END
        PRINT 
        100000000
        MOVE TEMP 57
            BEGIN
                MOVE TEMP 77
                    BEGIN
                        RETURN TEMP 58
                    END
                HLOAD TEMP 78 TEMP 77 0
                HLOAD TEMP 79 TEMP 78 16
                RETURN
                CALL TEMP 79
                (
                    TEMP 77
                    8
                )
            END
        MOVE TEMP 57
            BEGIN
                MOVE TEMP 80
                    BEGIN
                        RETURN TEMP 58
                    END
                HLOAD TEMP 81 TEMP 80 0
                HLOAD TEMP 82 TEMP 81 28
                RETURN
                CALL TEMP 82
                (
                    TEMP 80
                )
            END
        MOVE TEMP 57
            BEGIN
                MOVE TEMP 83
                    BEGIN
                        RETURN TEMP 58
                    END
                HLOAD TEMP 84 TEMP 83 0
                HLOAD TEMP 85 TEMP 84 16
                RETURN
                CALL TEMP 85
                (
                    TEMP 83
                    24
                )
            END
        MOVE TEMP 57
            BEGIN
                MOVE TEMP 86
                    BEGIN
                        RETURN TEMP 58
                    END
                HLOAD TEMP 87 TEMP 86 0
                HLOAD TEMP 88 TEMP 87 16
                RETURN
                CALL TEMP 88
                (
                    TEMP 86
                    4
                )
            END
        MOVE TEMP 57
            BEGIN
                MOVE TEMP 89
                    BEGIN
                        RETURN TEMP 58
                    END
                HLOAD TEMP 90 TEMP 89 0
                HLOAD TEMP 91 TEMP 90 16
                RETURN
                CALL TEMP 91
                (
                    TEMP 89
                    12
                )
            END
        MOVE TEMP 57
            BEGIN
                MOVE TEMP 92
                    BEGIN
                        RETURN TEMP 58
                    END
                HLOAD TEMP 93 TEMP 92 0
                HLOAD TEMP 94 TEMP 93 16
                RETURN
                CALL TEMP 94
                (
                    TEMP 92
                    20
                )
            END
        MOVE TEMP 57
            BEGIN
                MOVE TEMP 95
                    BEGIN
                        RETURN TEMP 58
                    END
                HLOAD TEMP 96 TEMP 95 0
                HLOAD TEMP 97 TEMP 96 16
                RETURN
                CALL TEMP 97
                (
                    TEMP 95
                    28
                )
            END
        MOVE TEMP 57
            BEGIN
                MOVE TEMP 98
                    BEGIN
                        RETURN TEMP 58
                    END
                HLOAD TEMP 99 TEMP 98 0
                HLOAD TEMP 100 TEMP 99 16
                RETURN
                CALL TEMP 100
                (
                    TEMP 98
                    14
                )
            END
        MOVE TEMP 57
            BEGIN
                MOVE TEMP 101
                    BEGIN
                        RETURN TEMP 58
                    END
                HLOAD TEMP 102 TEMP 101 0
                HLOAD TEMP 103 TEMP 102 28
                RETURN
                CALL TEMP 103
                (
                    TEMP 101
                )
            END
        PRINT 
        BEGIN
            MOVE TEMP 104
                BEGIN
                    RETURN TEMP 58
                END
            HLOAD TEMP 105 TEMP 104 0
            HLOAD TEMP 106 TEMP 105 8
            RETURN
            CALL TEMP 106
            (
                TEMP 104
                24
            )
        END
        PRINT 
        BEGIN
            MOVE TEMP 107
                BEGIN
                    RETURN TEMP 58
                END
            HLOAD TEMP 108 TEMP 107 0
            HLOAD TEMP 109 TEMP 108 8
            RETURN
            CALL TEMP 109
            (
                TEMP 107
                12
            )
        END
        PRINT 
        BEGIN
            MOVE TEMP 110
                BEGIN
                    RETURN TEMP 58
                END
            HLOAD TEMP 111 TEMP 110 0
            HLOAD TEMP 112 TEMP 111 8
            RETURN
            CALL TEMP 112
            (
                TEMP 110
                16
            )
        END
        PRINT 
        BEGIN
            MOVE TEMP 113
                BEGIN
                    RETURN TEMP 58
                END
            HLOAD TEMP 114 TEMP 113 0
            HLOAD TEMP 115 TEMP 114 8
            RETURN
            CALL TEMP 115
            (
                TEMP 113
                50
            )
        END
        PRINT 
        BEGIN
            MOVE TEMP 116
                BEGIN
                    RETURN TEMP 58
                END
            HLOAD TEMP 117 TEMP 116 0
            HLOAD TEMP 118 TEMP 117 8
            RETURN
            CALL TEMP 118
            (
                TEMP 116
                12
            )
        END
        MOVE TEMP 57
            BEGIN
                MOVE TEMP 119
                    BEGIN
                        RETURN TEMP 58
                    END
                HLOAD TEMP 120 TEMP 119 0
                HLOAD TEMP 121 TEMP 120 68
                RETURN
                CALL TEMP 121
                (
                    TEMP 119
                    12
                )
            END
        MOVE TEMP 57
            BEGIN
                MOVE TEMP 122
                    BEGIN
                        RETURN TEMP 58
                    END
                HLOAD TEMP 123 TEMP 122 0
                HLOAD TEMP 124 TEMP 123 28
                RETURN
                CALL TEMP 124
                (
                    TEMP 122
                )
            END
        PRINT 
        BEGIN
            MOVE TEMP 125
                BEGIN
                    RETURN TEMP 58
                END
            HLOAD TEMP 126 TEMP 125 0
            HLOAD TEMP 127 TEMP 126 8
            RETURN
            CALL TEMP 127
            (
                TEMP 125
                12
            )
        END
        MOVE TEMP 128
        0
        RETURN TEMP 128
    END
    Size_4_Tree_Init [ 1 ]
    BEGIN
        HSTORE TEMP 0 24
            BEGIN
                RETURN TEMP 1
            END
        HSTORE TEMP 0 20
            0
        HSTORE TEMP 0 8
            0
        MOVE TEMP 129
        1
        RETURN TEMP 129
    END
    Size_4_Tree_SetRight [ 1 ]
    BEGIN
        HSTORE TEMP 0 16
            BEGIN
                RETURN TEMP 1
            END
        MOVE TEMP 130
        1
        RETURN TEMP 130
    END
    Size_4_Tree_SetLeft [ 1 ]
    BEGIN
        HSTORE TEMP 0 12
            BEGIN
                RETURN TEMP 1
            END
        MOVE TEMP 131
        1
        RETURN TEMP 131
    END
    Size_4_Tree_GetRight [ 0 ]
    BEGIN
        MOVE TEMP 132
        BEGIN
            HLOAD TEMP 133 TEMP 0 16
            RETURN TEMP 133
        END
        RETURN TEMP 132
    END
    Size_4_Tree_GetLeft [ 0 ]
    BEGIN
        MOVE TEMP 134
        BEGIN
            HLOAD TEMP 135 TEMP 0 12
            RETURN TEMP 135
        END
        RETURN TEMP 134
    END
    Size_4_Tree_GetKey [ 0 ]
    BEGIN
        MOVE TEMP 136
        BEGIN
            HLOAD TEMP 137 TEMP 0 24
            RETURN TEMP 137
        END
        RETURN TEMP 136
    END
    Size_4_Tree_SetKey [ 1 ]
    BEGIN
        HSTORE TEMP 0 24
            BEGIN
                RETURN TEMP 1
            END
        MOVE TEMP 138
        1
        RETURN TEMP 138
    END
    Size_4_Tree_GetHas_Right [ 0 ]
    BEGIN
        MOVE TEMP 139
        BEGIN
            HLOAD TEMP 140 TEMP 0 8
            RETURN TEMP 140
        END
        RETURN TEMP 139
    END
    Size_4_Tree_GetHas_Left [ 0 ]
    BEGIN
        MOVE TEMP 141
        BEGIN
            HLOAD TEMP 142 TEMP 0 20
            RETURN TEMP 142
        END
        RETURN TEMP 141
    END
    Size_4_Tree_SetHas_Left [ 1 ]
    BEGIN
        HSTORE TEMP 0 20
            BEGIN
                RETURN TEMP 1
            END
        MOVE TEMP 143
        1
        RETURN TEMP 143
    END
    Size_4_Tree_SetHas_Right [ 1 ]
    BEGIN
        HSTORE TEMP 0 8
            BEGIN
                RETURN TEMP 1
            END
        MOVE TEMP 144
        1
        RETURN TEMP 144
    END
    Size_4_Tree_Compare [ 2 ]
    BEGIN
        MOVE TEMP 41
            0
        MOVE TEMP 42
            PLUS
                BEGIN
                    RETURN TEMP 2
                END
                1
        CJUMP
            LT
                BEGIN
                    RETURN TEMP 1
                END
                BEGIN
                    RETURN TEMP 2
                END
            L4
            MOVE TEMP 41
                0
            JUMP L5
            L4 NOOP
            CJUMP
            MINUS 1 
                LT
                    BEGIN
                        RETURN TEMP 1
                    END
                    BEGIN
                        RETURN TEMP 42
                    END
                L6
                MOVE TEMP 41
                    0
                JUMP L7
                L6 NOOP
                MOVE TEMP 41
                    1
                L7
                NOOP
            L5
            NOOP
        MOVE TEMP 146
        BEGIN
            RETURN TEMP 41
        END
        RETURN TEMP 146
    END
    Size_4_Tree_Insert [ 1 ]
    BEGIN
        MOVE TEMP 37
            BEGIN
                MOVE TEMP 148 HALLOCATE 28
                MOVE TEMP 149 HALLOCATE 80
                HSTORE TEMP 149 0 Size_4_Tree_GetRight
                HSTORE TEMP 149 4 Size_4_Tree_GetLeft
                HSTORE TEMP 149 8 Size_4_Tree_Search
                HSTORE TEMP 149 12 Size_4_Tree_RemoveRight
                HSTORE TEMP 149 16 Size_4_Tree_Insert
                HSTORE TEMP 149 20 Size_4_Tree_SetLeft
                HSTORE TEMP 149 24 Size_4_Tree_Compare
                HSTORE TEMP 149 28 Size_4_Tree_Print
                HSTORE TEMP 149 32 Size_4_Tree_GetHas_Left
                HSTORE TEMP 149 36 Size_4_Tree_RemoveLeft
                HSTORE TEMP 149 40 Size_4_Tree_SetHas_Left
                HSTORE TEMP 149 44 Size_4_Tree_GetHas_Right
                HSTORE TEMP 149 48 Size_4_Tree_GetKey
                HSTORE TEMP 149 52 Size_4_Tree_Init
                HSTORE TEMP 149 56 Size_4_Tree_SetKey
                HSTORE TEMP 149 60 Size_4_Tree_RecPrint
                HSTORE TEMP 149 64 Size_4_Tree_Remove
                HSTORE TEMP 149 68 Size_4_Tree_Delete
                HSTORE TEMP 149 72 Size_4_Tree_SetRight
                HSTORE TEMP 149 76 Size_4_Tree_SetHas_Right
                MOVE TEMP 150 4
                L8
                CJUMP LT TEMP 150 28 L9
                HSTORE PLUS TEMP 148 TEMP 150 0 0
                MOVE TEMP 150 PLUS TEMP 150 4
                JUMP L8
                L9
                HSTORE TEMP 148 0 TEMP 149
                RETURN TEMP 148
            END
        MOVE TEMP 36
            BEGIN
                MOVE TEMP 151
                    BEGIN
                        RETURN TEMP 37
                    END
                HLOAD TEMP 152 TEMP 151 0
                HLOAD TEMP 153 TEMP 152 52
                RETURN
                CALL TEMP 153
                (
                    TEMP 151
                    BEGIN
                        RETURN TEMP 1
                    END
                )
            END
        MOVE TEMP 40
            TEMP 0
        MOVE TEMP 39
            1
        L10
         CJUMP 
        BEGIN
            RETURN TEMP 39
        END
        L11
        MOVE TEMP 38
            BEGIN
                MOVE TEMP 154
                    BEGIN
                        RETURN TEMP 40
                    END
                HLOAD TEMP 155 TEMP 154 0
                HLOAD TEMP 156 TEMP 155 48
                RETURN
                CALL TEMP 156
                (
                    TEMP 154
                )
            END
        CJUMP
            LT
                BEGIN
                    RETURN TEMP 1
                END
                BEGIN
                    RETURN TEMP 38
                END
            L12
            CJUMP
                BEGIN
                    MOVE TEMP 157
                        BEGIN
                            RETURN TEMP 40
                        END
                    HLOAD TEMP 158 TEMP 157 0
                    HLOAD TEMP 159 TEMP 158 32
                    RETURN
                    CALL TEMP 159
                    (
                        TEMP 157
                    )
                END
                L14
                MOVE TEMP 40
                    BEGIN
                        MOVE TEMP 160
                            BEGIN
                                RETURN TEMP 40
                            END
                        HLOAD TEMP 161 TEMP 160 0
                        HLOAD TEMP 162 TEMP 161 4
                        RETURN
                        CALL TEMP 162
                        (
                            TEMP 160
                        )
                    END
                JUMP L15
                L14 NOOP
                MOVE TEMP 39
                    0
                MOVE TEMP 36
                    BEGIN
                        MOVE TEMP 163
                            BEGIN
                                RETURN TEMP 40
                            END
                        HLOAD TEMP 164 TEMP 163 0
                        HLOAD TEMP 165 TEMP 164 40
                        RETURN
                        CALL TEMP 165
                        (
                            TEMP 163
                            1
                        )
                    END
                MOVE TEMP 36
                    BEGIN
                        MOVE TEMP 166
                            BEGIN
                                RETURN TEMP 40
                            END
                        HLOAD TEMP 167 TEMP 166 0
                        HLOAD TEMP 168 TEMP 167 20
                        RETURN
                        CALL TEMP 168
                        (
                            TEMP 166
                            BEGIN
                                RETURN TEMP 37
                            END
                        )
                    END
                L15
                NOOP
            JUMP L13
            L12 NOOP
            CJUMP
                BEGIN
                    MOVE TEMP 169
                        BEGIN
                            RETURN TEMP 40
                        END
                    HLOAD TEMP 170 TEMP 169 0
                    HLOAD TEMP 171 TEMP 170 44
                    RETURN
                    CALL TEMP 171
                    (
                        TEMP 169
                    )
                END
                L16
                MOVE TEMP 40
                    BEGIN
                        MOVE TEMP 172
                            BEGIN
                                RETURN TEMP 40
                            END
                        HLOAD TEMP 173 TEMP 172 0
                        HLOAD TEMP 174 TEMP 173 0
                        RETURN
                        CALL TEMP 174
                        (
                            TEMP 172
                        )
                    END
                JUMP L17
                L16 NOOP
                MOVE TEMP 39
                    0
                MOVE TEMP 36
                    BEGIN
                        MOVE TEMP 175
                            BEGIN
                                RETURN TEMP 40
                            END
                        HLOAD TEMP 176 TEMP 175 0
                        HLOAD TEMP 177 TEMP 176 76
                        RETURN
                        CALL TEMP 177
                        (
                            TEMP 175
                            1
                        )
                    END
                MOVE TEMP 36
                    BEGIN
                        MOVE TEMP 178
                            BEGIN
                                RETURN TEMP 40
                            END
                        HLOAD TEMP 179 TEMP 178 0
                        HLOAD TEMP 180 TEMP 179 72
                        RETURN
                        CALL TEMP 180
                        (
                            TEMP 178
                            BEGIN
                                RETURN TEMP 37
                            END
                        )
                    END
                L17
                NOOP
            L13
            NOOP
        JUMP L10
        L11
        NOOP
        MOVE TEMP 181
        1
        RETURN TEMP 181
    END
    Size_4_Tree_Delete [ 1 ]
    BEGIN
        MOVE TEMP 56
            TEMP 0
        MOVE TEMP 51
            TEMP 0
        MOVE TEMP 54
            1
        MOVE TEMP 55
            0
        MOVE TEMP 50
            1
        L18
         CJUMP 
        BEGIN
            RETURN TEMP 54
        END
        L19
        MOVE TEMP 53
            BEGIN
                MOVE TEMP 182
                    BEGIN
                        RETURN TEMP 56
                    END
                HLOAD TEMP 183 TEMP 182 0
                HLOAD TEMP 184 TEMP 183 48
                RETURN
                CALL TEMP 184
                (
                    TEMP 182
                )
            END
        CJUMP
            LT
                BEGIN
                    RETURN TEMP 1
                END
                BEGIN
                    RETURN TEMP 53
                END
            L20
            CJUMP
                BEGIN
                    MOVE TEMP 185
                        BEGIN
                            RETURN TEMP 56
                        END
                    HLOAD TEMP 186 TEMP 185 0
                    HLOAD TEMP 187 TEMP 186 32
                    RETURN
                    CALL TEMP 187
                    (
                        TEMP 185
                    )
                END
                L22
                MOVE TEMP 51
                    BEGIN
                        RETURN TEMP 56
                    END
                MOVE TEMP 56
                    BEGIN
                        MOVE TEMP 188
                            BEGIN
                                RETURN TEMP 56
                            END
                        HLOAD TEMP 189 TEMP 188 0
                        HLOAD TEMP 190 TEMP 189 4
                        RETURN
                        CALL TEMP 190
                        (
                            TEMP 188
                        )
                    END
                JUMP L23
                L22 NOOP
                MOVE TEMP 54
                    0
                L23
                NOOP
            JUMP L21
            L20 NOOP
            CJUMP
                LT
                    BEGIN
                        RETURN TEMP 53
                    END
                    BEGIN
                        RETURN TEMP 1
                    END
                L24
                CJUMP
                    BEGIN
                        MOVE TEMP 191
                            BEGIN
                                RETURN TEMP 56
                            END
                        HLOAD TEMP 192 TEMP 191 0
                        HLOAD TEMP 193 TEMP 192 44
                        RETURN
                        CALL TEMP 193
                        (
                            TEMP 191
                        )
                    END
                    L26
                    MOVE TEMP 51
                        BEGIN
                            RETURN TEMP 56
                        END
                    MOVE TEMP 56
                        BEGIN
                            MOVE TEMP 194
                                BEGIN
                                    RETURN TEMP 56
                                END
                            HLOAD TEMP 195 TEMP 194 0
                            HLOAD TEMP 196 TEMP 195 0
                            RETURN
                            CALL TEMP 196
                            (
                                TEMP 194
                            )
                        END
                    JUMP L27
                    L26 NOOP
                    MOVE TEMP 54
                        0
                    L27
                    NOOP
                JUMP L25
                L24 NOOP
                CJUMP
                    BEGIN
                        RETURN TEMP 50
                    END
                    L28
                    CJUMP
                        TIMES
                        MINUS 1 
                            BEGIN
                                MOVE TEMP 197
                                    BEGIN
                                        RETURN TEMP 56
                                    END
                                HLOAD TEMP 198 TEMP 197 0
                                HLOAD TEMP 199 TEMP 198 44
                                RETURN
                                CALL TEMP 199
                                (
                                    TEMP 197
                                )
                            END
                        MINUS 1 
                            BEGIN
                                MOVE TEMP 201
                                    BEGIN
                                        RETURN TEMP 56
                                    END
                                HLOAD TEMP 202 TEMP 201 0
                                HLOAD TEMP 203 TEMP 202 32
                                RETURN
                                CALL TEMP 203
                                (
                                    TEMP 201
                                )
                            END
                        L30
                        MOVE TEMP 52
                            1
                        JUMP L31
                        L30 NOOP
                        MOVE TEMP 52
                            BEGIN
                                MOVE TEMP 205
                                    TEMP 0
                                HLOAD TEMP 206 TEMP 205 0
                                HLOAD TEMP 207 TEMP 206 64
                                RETURN
                                CALL TEMP 207
                                (
                                    TEMP 205
                                    BEGIN
                                        RETURN TEMP 51
                                    END
                                    BEGIN
                                        RETURN TEMP 56
                                    END
                                )
                            END
                        L31
                        NOOP
                    JUMP L29
                    L28 NOOP
                    MOVE TEMP 52
                        BEGIN
                            MOVE TEMP 208
                                TEMP 0
                            HLOAD TEMP 209 TEMP 208 0
                            HLOAD TEMP 210 TEMP 209 64
                            RETURN
                            CALL TEMP 210
                            (
                                TEMP 208
                                BEGIN
                                    RETURN TEMP 51
                                END
                                BEGIN
                                    RETURN TEMP 56
                                END
                            )
                        END
                    L29
                    NOOP
                MOVE TEMP 55
                    1
                MOVE TEMP 54
                    0
                L25
                NOOP
            L21
            NOOP
        MOVE TEMP 50
            0
        JUMP L18
        L19
        NOOP
        MOVE TEMP 211
        BEGIN
            RETURN TEMP 55
        END
        RETURN TEMP 211
    END
    Size_4_Tree_Remove [ 2 ]
    BEGIN
        CJUMP
            BEGIN
                MOVE TEMP 212
                    BEGIN
                        RETURN TEMP 2
                    END
                HLOAD TEMP 213 TEMP 212 0
                HLOAD TEMP 214 TEMP 213 32
                RETURN
                CALL TEMP 214
                (
                    TEMP 212
                )
            END
            L32
            MOVE TEMP 47
                BEGIN
                    MOVE TEMP 215
                        TEMP 0
                    HLOAD TEMP 216 TEMP 215 0
                    HLOAD TEMP 217 TEMP 216 36
                    RETURN
                    CALL TEMP 217
                    (
                        TEMP 215
                        BEGIN
                            RETURN TEMP 1
                        END
                        BEGIN
                            RETURN TEMP 2
                        END
                    )
                END
            JUMP L33
            L32 NOOP
            CJUMP
                BEGIN
                    MOVE TEMP 218
                        BEGIN
                            RETURN TEMP 2
                        END
                    HLOAD TEMP 219 TEMP 218 0
                    HLOAD TEMP 220 TEMP 219 44
                    RETURN
                    CALL TEMP 220
                    (
                        TEMP 218
                    )
                END
                L34
                MOVE TEMP 47
                    BEGIN
                        MOVE TEMP 221
                            TEMP 0
                        HLOAD TEMP 222 TEMP 221 0
                        HLOAD TEMP 223 TEMP 222 12
                        RETURN
                        CALL TEMP 223
                        (
                            TEMP 221
                            BEGIN
                                RETURN TEMP 1
                            END
                            BEGIN
                                RETURN TEMP 2
                            END
                        )
                    END
                JUMP L35
                L34 NOOP
                MOVE TEMP 48
                    BEGIN
                        MOVE TEMP 224
                            BEGIN
                                RETURN TEMP 2
                            END
                        HLOAD TEMP 225 TEMP 224 0
                        HLOAD TEMP 226 TEMP 225 48
                        RETURN
                        CALL TEMP 226
                        (
                            TEMP 224
                        )
                    END
                MOVE TEMP 49
                    BEGIN
                        MOVE TEMP 227
                            BEGIN
                                MOVE TEMP 228
                                    BEGIN
                                        RETURN TEMP 1
                                    END
                                HLOAD TEMP 229 TEMP 228 0
                                HLOAD TEMP 230 TEMP 229 4
                                RETURN
                                CALL TEMP 230
                                (
                                    TEMP 228
                                )
                            END
                        HLOAD TEMP 231 TEMP 227 0
                        HLOAD TEMP 232 TEMP 231 48
                        RETURN
                        CALL TEMP 232
                        (
                            TEMP 227
                        )
                    END
                CJUMP
                    BEGIN
                        MOVE TEMP 233
                            TEMP 0
                        HLOAD TEMP 234 TEMP 233 0
                        HLOAD TEMP 235 TEMP 234 24
                        RETURN
                        CALL TEMP 235
                        (
                            TEMP 233
                            BEGIN
                                RETURN TEMP 48
                            END
                            BEGIN
                                RETURN TEMP 49
                            END
                        )
                    END
                    L36
                    MOVE TEMP 47
                        BEGIN
                            MOVE TEMP 236
                                BEGIN
                                    RETURN TEMP 1
                                END
                            HLOAD TEMP 237 TEMP 236 0
                            HLOAD TEMP 238 TEMP 237 20
                            RETURN
                            CALL TEMP 238
                            (
                                TEMP 236
                                BEGIN
                                    HLOAD TEMP 239 TEMP 0 4
                                    RETURN TEMP 239
                                END
                            )
                        END
                    MOVE TEMP 47
                        BEGIN
                            MOVE TEMP 240
                                BEGIN
                                    RETURN TEMP 1
                                END
                            HLOAD TEMP 241 TEMP 240 0
                            HLOAD TEMP 242 TEMP 241 40
                            RETURN
                            CALL TEMP 242
                            (
                                TEMP 240
                                0
                            )
                        END
                    JUMP L37
                    L36 NOOP
                    MOVE TEMP 47
                        BEGIN
                            MOVE TEMP 243
                                BEGIN
                                    RETURN TEMP 1
                                END
                            HLOAD TEMP 244 TEMP 243 0
                            HLOAD TEMP 245 TEMP 244 72
                            RETURN
                            CALL TEMP 245
                            (
                                TEMP 243
                                BEGIN
                                    HLOAD TEMP 246 TEMP 0 4
                                    RETURN TEMP 246
                                END
                            )
                        END
                    MOVE TEMP 47
                        BEGIN
                            MOVE TEMP 247
                                BEGIN
                                    RETURN TEMP 1
                                END
                            HLOAD TEMP 248 TEMP 247 0
                            HLOAD TEMP 249 TEMP 248 76
                            RETURN
                            CALL TEMP 249
                            (
                                TEMP 247
                                0
                            )
                        END
                    L37
                    NOOP
                L35
                NOOP
            L33
            NOOP
        MOVE TEMP 250
        1
        RETURN TEMP 250
    END
    Size_4_Tree_RemoveRight [ 2 ]
    BEGIN
        L38
         CJUMP 
        BEGIN
            MOVE TEMP 251
                BEGIN
                    RETURN TEMP 2
                END
            HLOAD TEMP 252 TEMP 251 0
            HLOAD TEMP 253 TEMP 252 44
            RETURN
            CALL TEMP 253
            (
                TEMP 251
            )
        END
        L39
        MOVE TEMP 35
            BEGIN
                MOVE TEMP 254
                    BEGIN
                        RETURN TEMP 2
                    END
                HLOAD TEMP 255 TEMP 254 0
                HLOAD TEMP 256 TEMP 255 56
                RETURN
                CALL TEMP 256
                (
                    TEMP 254
                    BEGIN
                        MOVE TEMP 257
                            BEGIN
                                MOVE TEMP 258
                                    BEGIN
                                        RETURN TEMP 2
                                    END
                                HLOAD TEMP 259 TEMP 258 0
                                HLOAD TEMP 260 TEMP 259 0
                                RETURN
                                CALL TEMP 260
                                (
                                    TEMP 258
                                )
                            END
                        HLOAD TEMP 261 TEMP 257 0
                        HLOAD TEMP 262 TEMP 261 48
                        RETURN
                        CALL TEMP 262
                        (
                            TEMP 257
                        )
                    END
                )
            END
        MOVE TEMP 1
            BEGIN
                RETURN TEMP 2
            END
        MOVE TEMP 2
            BEGIN
                MOVE TEMP 263
                    BEGIN
                        RETURN TEMP 2
                    END
                HLOAD TEMP 264 TEMP 263 0
                HLOAD TEMP 265 TEMP 264 0
                RETURN
                CALL TEMP 265
                (
                    TEMP 263
                )
            END
        JUMP L38
        L39
        NOOP
        MOVE TEMP 35
            BEGIN
                MOVE TEMP 266
                    BEGIN
                        RETURN TEMP 1
                    END
                HLOAD TEMP 267 TEMP 266 0
                HLOAD TEMP 268 TEMP 267 72
                RETURN
                CALL TEMP 268
                (
                    TEMP 266
                    BEGIN
                        HLOAD TEMP 269 TEMP 0 4
                        RETURN TEMP 269
                    END
                )
            END
        MOVE TEMP 35
            BEGIN
                MOVE TEMP 270
                    BEGIN
                        RETURN TEMP 1
                    END
                HLOAD TEMP 271 TEMP 270 0
                HLOAD TEMP 272 TEMP 271 76
                RETURN
                CALL TEMP 272
                (
                    TEMP 270
                    0
                )
            END
        MOVE TEMP 273
        1
        RETURN TEMP 273
    END
    Size_4_Tree_RemoveLeft [ 2 ]
    BEGIN
        L40
         CJUMP 
        BEGIN
            MOVE TEMP 274
                BEGIN
                    RETURN TEMP 2
                END
            HLOAD TEMP 275 TEMP 274 0
            HLOAD TEMP 276 TEMP 275 32
            RETURN
            CALL TEMP 276
            (
                TEMP 274
            )
        END
        L41
        MOVE TEMP 45
            BEGIN
                MOVE TEMP 277
                    BEGIN
                        RETURN TEMP 2
                    END
                HLOAD TEMP 278 TEMP 277 0
                HLOAD TEMP 279 TEMP 278 56
                RETURN
                CALL TEMP 279
                (
                    TEMP 277
                    BEGIN
                        MOVE TEMP 280
                            BEGIN
                                MOVE TEMP 281
                                    BEGIN
                                        RETURN TEMP 2
                                    END
                                HLOAD TEMP 282 TEMP 281 0
                                HLOAD TEMP 283 TEMP 282 4
                                RETURN
                                CALL TEMP 283
                                (
                                    TEMP 281
                                )
                            END
                        HLOAD TEMP 284 TEMP 280 0
                        HLOAD TEMP 285 TEMP 284 48
                        RETURN
                        CALL TEMP 285
                        (
                            TEMP 280
                        )
                    END
                )
            END
        MOVE TEMP 1
            BEGIN
                RETURN TEMP 2
            END
        MOVE TEMP 2
            BEGIN
                MOVE TEMP 286
                    BEGIN
                        RETURN TEMP 2
                    END
                HLOAD TEMP 287 TEMP 286 0
                HLOAD TEMP 288 TEMP 287 4
                RETURN
                CALL TEMP 288
                (
                    TEMP 286
                )
            END
        JUMP L40
        L41
        NOOP
        MOVE TEMP 45
            BEGIN
                MOVE TEMP 289
                    BEGIN
                        RETURN TEMP 1
                    END
                HLOAD TEMP 290 TEMP 289 0
                HLOAD TEMP 291 TEMP 290 20
                RETURN
                CALL TEMP 291
                (
                    TEMP 289
                    BEGIN
                        HLOAD TEMP 292 TEMP 0 4
                        RETURN TEMP 292
                    END
                )
            END
        MOVE TEMP 45
            BEGIN
                MOVE TEMP 293
                    BEGIN
                        RETURN TEMP 1
                    END
                HLOAD TEMP 294 TEMP 293 0
                HLOAD TEMP 295 TEMP 294 40
                RETURN
                CALL TEMP 295
                (
                    TEMP 293
                    0
                )
            END
        MOVE TEMP 296
        1
        RETURN TEMP 296
    END
    Size_4_Tree_Search [ 1 ]
    BEGIN
        MOVE TEMP 34
            TEMP 0
        MOVE TEMP 33
            1
        MOVE TEMP 31
            0
        L42
         CJUMP 
        BEGIN
            RETURN TEMP 33
        END
        L43
        MOVE TEMP 32
            BEGIN
                MOVE TEMP 297
                    BEGIN
                        RETURN TEMP 34
                    END
                HLOAD TEMP 298 TEMP 297 0
                HLOAD TEMP 299 TEMP 298 48
                RETURN
                CALL TEMP 299
                (
                    TEMP 297
                )
            END
        CJUMP
            LT
                BEGIN
                    RETURN TEMP 1
                END
                BEGIN
                    RETURN TEMP 32
                END
            L44
            CJUMP
                BEGIN
                    MOVE TEMP 300
                        BEGIN
                            RETURN TEMP 34
                        END
                    HLOAD TEMP 301 TEMP 300 0
                    HLOAD TEMP 302 TEMP 301 32
                    RETURN
                    CALL TEMP 302
                    (
                        TEMP 300
                    )
                END
                L46
                MOVE TEMP 34
                    BEGIN
                        MOVE TEMP 303
                            BEGIN
                                RETURN TEMP 34
                            END
                        HLOAD TEMP 304 TEMP 303 0
                        HLOAD TEMP 305 TEMP 304 4
                        RETURN
                        CALL TEMP 305
                        (
                            TEMP 303
                        )
                    END
                JUMP L47
                L46 NOOP
                MOVE TEMP 33
                    0
                L47
                NOOP
            JUMP L45
            L44 NOOP
            CJUMP
                LT
                    BEGIN
                        RETURN TEMP 32
                    END
                    BEGIN
                        RETURN TEMP 1
                    END
                L48
                CJUMP
                    BEGIN
                        MOVE TEMP 306
                            BEGIN
                                RETURN TEMP 34
                            END
                        HLOAD TEMP 307 TEMP 306 0
                        HLOAD TEMP 308 TEMP 307 44
                        RETURN
                        CALL TEMP 308
                        (
                            TEMP 306
                        )
                    END
                    L50
                    MOVE TEMP 34
                        BEGIN
                            MOVE TEMP 309
                                BEGIN
                                    RETURN TEMP 34
                                END
                            HLOAD TEMP 310 TEMP 309 0
                            HLOAD TEMP 311 TEMP 310 0
                            RETURN
                            CALL TEMP 311
                            (
                                TEMP 309
                            )
                        END
                    JUMP L51
                    L50 NOOP
                    MOVE TEMP 33
                        0
                    L51
                    NOOP
                JUMP L49
                L48 NOOP
                MOVE TEMP 31
                    1
                MOVE TEMP 33
                    0
                L49
                NOOP
            L45
            NOOP
        JUMP L42
        L43
        NOOP
        MOVE TEMP 312
        BEGIN
            RETURN TEMP 31
        END
        RETURN TEMP 312
    END
    Size_4_Tree_Print [ 0 ]
    BEGIN
        MOVE TEMP 44
            TEMP 0
        MOVE TEMP 43
            BEGIN
                MOVE TEMP 313
                    TEMP 0
                HLOAD TEMP 314 TEMP 313 0
                HLOAD TEMP 315 TEMP 314 60
                RETURN
                CALL TEMP 315
                (
                    TEMP 313
                    BEGIN
                        RETURN TEMP 44
                    END
                )
            END
        MOVE TEMP 316
        1
        RETURN TEMP 316
    END
    Size_4_Tree_RecPrint [ 1 ]
    BEGIN
        CJUMP
            BEGIN
                MOVE TEMP 317
                    BEGIN
                        RETURN TEMP 1
                    END
                HLOAD TEMP 318 TEMP 317 0
                HLOAD TEMP 319 TEMP 318 32
                RETURN
                CALL TEMP 319
                (
                    TEMP 317
                )
            END
            L52
            MOVE TEMP 46
                BEGIN
                    MOVE TEMP 320
                        TEMP 0
                    HLOAD TEMP 321 TEMP 320 0
                    HLOAD TEMP 322 TEMP 321 60
                    RETURN
                    CALL TEMP 322
                    (
                        TEMP 320
                        BEGIN
                            MOVE TEMP 323
                                BEGIN
                                    RETURN TEMP 1
                                END
                            HLOAD TEMP 324 TEMP 323 0
                            HLOAD TEMP 325 TEMP 324 4
                            RETURN
                            CALL TEMP 325
                            (
                                TEMP 323
                            )
                        END
                    )
                END
            JUMP L53
            L52 NOOP
            MOVE TEMP 46
                1
            L53
            NOOP
        PRINT 
        BEGIN
            MOVE TEMP 326
                BEGIN
                    RETURN TEMP 1
                END
            HLOAD TEMP 327 TEMP 326 0
            HLOAD TEMP 328 TEMP 327 48
            RETURN
            CALL TEMP 328
            (
                TEMP 326
            )
        END
        CJUMP
            BEGIN
                MOVE TEMP 329
                    BEGIN
                        RETURN TEMP 1
                    END
                HLOAD TEMP 330 TEMP 329 0
                HLOAD TEMP 331 TEMP 330 44
                RETURN
                CALL TEMP 331
                (
                    TEMP 329
                )
            END
            L54
            MOVE TEMP 46
                BEGIN
                    MOVE TEMP 332
                        TEMP 0
                    HLOAD TEMP 333 TEMP 332 0
                    HLOAD TEMP 334 TEMP 333 60
                    RETURN
                    CALL TEMP 334
                    (
                        TEMP 332
                        BEGIN
                            MOVE TEMP 335
                                BEGIN
                                    RETURN TEMP 1
                                END
                            HLOAD TEMP 336 TEMP 335 0
                            HLOAD TEMP 337 TEMP 336 0
                            RETURN
                            CALL TEMP 337
                            (
                                TEMP 335
                            )
                        END
                    )
                END
            JUMP L55
            L54 NOOP
            MOVE TEMP 46
                1
            L55
            NOOP
        MOVE TEMP 338
        1
        RETURN TEMP 338
    END
