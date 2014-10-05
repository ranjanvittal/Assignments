MAIN
    PRINT 
    BEGIN
        MOVE TEMP 63
            BEGIN
                MOVE TEMP 65 HALLOCATE 4
                MOVE TEMP 66 HALLOCATE 4
                HSTORE TEMP 66 0 Size_2_LL_Start
                MOVE TEMP 67 4
                L0
                CJUMP LT TEMP 67 4 L1
                HSTORE PLUS TEMP 65 TEMP 67 0 0
                MOVE TEMP 67 PLUS TEMP 67 4
                JUMP L0
                L1
                HSTORE TEMP 65 0 TEMP 66
                RETURN TEMP 65
            END
        HLOAD TEMP 68 TEMP 63 0
        HLOAD TEMP 69 TEMP 68 0
        RETURN
        CALL TEMP 69
        (
            TEMP 63
        )
    END
END
    Size_7_Element_Init [ 3 ]
    BEGIN
        HSTORE TEMP 0 4
            BEGIN
                RETURN TEMP 1
            END
        HSTORE TEMP 0 12
            BEGIN
                RETURN TEMP 2
            END
        HSTORE TEMP 0 8
            BEGIN
                RETURN TEMP 3
            END
        MOVE TEMP 70
        1
        RETURN TEMP 70
    END
    Size_7_Element_GetAge [ 0 ]
    BEGIN
        MOVE TEMP 71
        BEGIN
            HLOAD TEMP 72 TEMP 0 4
            RETURN TEMP 72
        END
        RETURN TEMP 71
    END
    Size_7_Element_GetSalary [ 0 ]
    BEGIN
        MOVE TEMP 73
        BEGIN
            HLOAD TEMP 74 TEMP 0 12
            RETURN TEMP 74
        END
        RETURN TEMP 73
    END
    Size_7_Element_GetMarried [ 0 ]
    BEGIN
        MOVE TEMP 75
        BEGIN
            HLOAD TEMP 76 TEMP 0 8
            RETURN TEMP 76
        END
        RETURN TEMP 75
    END
    Size_7_Element_Equal [ 1 ]
    BEGIN
        MOVE TEMP 60
            1
        MOVE TEMP 59
            BEGIN
                MOVE TEMP 77
                    BEGIN
                        RETURN TEMP 1
                    END
                HLOAD TEMP 78 TEMP 77 0
                HLOAD TEMP 79 TEMP 78 0
                RETURN
                CALL TEMP 79
                (
                    TEMP 77
                )
            END
        CJUMP
        MINUS 1 
            BEGIN
                MOVE TEMP 80
                    TEMP 0
                HLOAD TEMP 81 TEMP 80 0
                HLOAD TEMP 82 TEMP 81 12
                RETURN
                CALL TEMP 82
                (
                    TEMP 80
                    BEGIN
                        RETURN TEMP 59
                    END
                    BEGIN
                        HLOAD TEMP 83 TEMP 0 4
                        RETURN TEMP 83
                    END
                )
            END
            L2
            MOVE TEMP 60
                0
            JUMP L3
            L2 NOOP
            MOVE TEMP 58
                BEGIN
                    MOVE TEMP 85
                        BEGIN
                            RETURN TEMP 1
                        END
                    HLOAD TEMP 86 TEMP 85 0
                    HLOAD TEMP 87 TEMP 86 20
                    RETURN
                    CALL TEMP 87
                    (
                        TEMP 85
                    )
                END
            CJUMP
            MINUS 1 
                BEGIN
                    MOVE TEMP 88
                        TEMP 0
                    HLOAD TEMP 89 TEMP 88 0
                    HLOAD TEMP 90 TEMP 89 12
                    RETURN
                    CALL TEMP 90
                    (
                        TEMP 88
                        BEGIN
                            RETURN TEMP 58
                        END
                        BEGIN
                            HLOAD TEMP 91 TEMP 0 12
                            RETURN TEMP 91
                        END
                    )
                END
                L4
                MOVE TEMP 60
                    0
                JUMP L5
                L4 NOOP
                CJUMP
                    BEGIN
                        HLOAD TEMP 93 TEMP 0 8
                        RETURN TEMP 93
                    END
                    L6
                    CJUMP
                    MINUS 1 
                        BEGIN
                            MOVE TEMP 94
                                BEGIN
                                    RETURN TEMP 1
                                END
                            HLOAD TEMP 95 TEMP 94 0
                            HLOAD TEMP 96 TEMP 95 16
                            RETURN
                            CALL TEMP 96
                            (
                                TEMP 94
                            )
                        END
                        L8
                        MOVE TEMP 60
                            0
                        JUMP L9
                        L8 NOOP
                        MOVE TEMP 57
                            0
                        L9
                        NOOP
                    JUMP L7
                    L6 NOOP
                    CJUMP
                        BEGIN
                            MOVE TEMP 98
                                BEGIN
                                    RETURN TEMP 1
                                END
                            HLOAD TEMP 99 TEMP 98 0
                            HLOAD TEMP 100 TEMP 99 16
                            RETURN
                            CALL TEMP 100
                            (
                                TEMP 98
                            )
                        END
                        L10
                        MOVE TEMP 60
                            0
                        JUMP L11
                        L10 NOOP
                        MOVE TEMP 57
                            0
                        L11
                        NOOP
                    L7
                    NOOP
                L5
                NOOP
            L3
            NOOP
        MOVE TEMP 101
        BEGIN
            RETURN TEMP 60
        END
        RETURN TEMP 101
    END
    Size_7_Element_Compare [ 2 ]
    BEGIN
        MOVE TEMP 61
            0
        MOVE TEMP 62
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
            L12
            MOVE TEMP 61
                0
            JUMP L13
            L12 NOOP
            CJUMP
            MINUS 1 
                LT
                    BEGIN
                        RETURN TEMP 1
                    END
                    BEGIN
                        RETURN TEMP 62
                    END
                L14
                MOVE TEMP 61
                    0
                JUMP L15
                L14 NOOP
                MOVE TEMP 61
                    1
                L15
                NOOP
            L13
            NOOP
        MOVE TEMP 103
        BEGIN
            RETURN TEMP 61
        END
        RETURN TEMP 103
    END
    Size_4_List_Init [ 0 ]
    BEGIN
        HSTORE TEMP 0 12
            1
        MOVE TEMP 104
        1
        RETURN TEMP 104
    END
    Size_4_List_InitNew [ 3 ]
    BEGIN
        HSTORE TEMP 0 12
            BEGIN
                RETURN TEMP 3
            END
        HSTORE TEMP 0 4
            BEGIN
                RETURN TEMP 1
            END
        HSTORE TEMP 0 8
            BEGIN
                RETURN TEMP 2
            END
        MOVE TEMP 105
        1
        RETURN TEMP 105
    END
    Size_4_List_Insert [ 1 ]
    BEGIN
        MOVE TEMP 42
            TEMP 0
        MOVE TEMP 43
            BEGIN
                MOVE TEMP 107 HALLOCATE 16
                MOVE TEMP 108 HALLOCATE 40
                HSTORE TEMP 108 0 Size_4_List_GetNext
                HSTORE TEMP 108 4 Size_4_List_Search
                HSTORE TEMP 108 8 Size_4_List_Insert
                HSTORE TEMP 108 12 Size_4_List_InitNew
                HSTORE TEMP 108 16 Size_4_List_Init
                HSTORE TEMP 108 20 Size_4_List_GetElem
                HSTORE TEMP 108 24 Size_4_List_Delete
                HSTORE TEMP 108 28 Size_4_List_SetNext
                HSTORE TEMP 108 32 Size_4_List_Print
                HSTORE TEMP 108 36 Size_4_List_GetEnd
                MOVE TEMP 109 4
                L16
                CJUMP LT TEMP 109 16 L17
                HSTORE PLUS TEMP 107 TEMP 109 0 0
                MOVE TEMP 109 PLUS TEMP 109 4
                JUMP L16
                L17
                HSTORE TEMP 107 0 TEMP 108
                RETURN TEMP 107
            END
        MOVE TEMP 44
            BEGIN
                MOVE TEMP 110
                    BEGIN
                        RETURN TEMP 43
                    END
                HLOAD TEMP 111 TEMP 110 0
                HLOAD TEMP 112 TEMP 111 12
                RETURN
                CALL TEMP 112
                (
                    TEMP 110
                    BEGIN
                        RETURN TEMP 1
                    END
                    BEGIN
                        RETURN TEMP 42
                    END
                    0
                )
            END
        MOVE TEMP 113
        BEGIN
            RETURN TEMP 43
        END
        RETURN TEMP 113
    END
    Size_4_List_SetNext [ 1 ]
    BEGIN
        HSTORE TEMP 0 8
            BEGIN
                RETURN TEMP 1
            END
        MOVE TEMP 114
        1
        RETURN TEMP 114
    END
    Size_4_List_Delete [ 1 ]
    BEGIN
        MOVE TEMP 52
            TEMP 0
        MOVE TEMP 51
            0
        MOVE TEMP 49
            MINUS
                0
                1
        MOVE TEMP 50
            TEMP 0
        MOVE TEMP 53
            TEMP 0
        MOVE TEMP 47
            BEGIN
                HLOAD TEMP 115 TEMP 0 12
                RETURN TEMP 115
            END
        MOVE TEMP 45
            BEGIN
                HLOAD TEMP 116 TEMP 0 4
                RETURN TEMP 116
            END
        L18
         CJUMP 
        TIMES
        MINUS 1 
            BEGIN
                RETURN TEMP 47
            END
        MINUS 1 
            BEGIN
                RETURN TEMP 51
            END
        L19
        CJUMP
            BEGIN
                MOVE TEMP 119
                    BEGIN
                        RETURN TEMP 1
                    END
                HLOAD TEMP 120 TEMP 119 0
                HLOAD TEMP 121 TEMP 120 8
                RETURN
                CALL TEMP 121
                (
                    TEMP 119
                    BEGIN
                        RETURN TEMP 45
                    END
                )
            END
            L20
            MOVE TEMP 51
                1
            CJUMP
                LT
                    BEGIN
                        RETURN TEMP 49
                    END
                    0
                L22
                MOVE TEMP 52
                    BEGIN
                        MOVE TEMP 122
                            BEGIN
                                RETURN TEMP 50
                            END
                        HLOAD TEMP 123 TEMP 122 0
                        HLOAD TEMP 124 TEMP 123 0
                        RETURN
                        CALL TEMP 124
                        (
                            TEMP 122
                        )
                    END
                JUMP L23
                L22 NOOP
                PRINT 
                MINUS
                    0
                    555
                MOVE TEMP 48
                    BEGIN
                        MOVE TEMP 125
                            BEGIN
                                RETURN TEMP 53
                            END
                        HLOAD TEMP 126 TEMP 125 0
                        HLOAD TEMP 127 TEMP 126 28
                        RETURN
                        CALL TEMP 127
                        (
                            TEMP 125
                            BEGIN
                                MOVE TEMP 128
                                    BEGIN
                                        RETURN TEMP 50
                                    END
                                HLOAD TEMP 129 TEMP 128 0
                                HLOAD TEMP 130 TEMP 129 0
                                RETURN
                                CALL TEMP 130
                                (
                                    TEMP 128
                                )
                            END
                        )
                    END
                PRINT 
                MINUS
                    0
                    555
                L23
                NOOP
            JUMP L21
            L20 NOOP
            MOVE TEMP 46
                0
            L21
            NOOP
        CJUMP
        MINUS 1 
            BEGIN
                RETURN TEMP 51
            END
            L24
            MOVE TEMP 53
                BEGIN
                    RETURN TEMP 50
                END
            MOVE TEMP 50
                BEGIN
                    MOVE TEMP 132
                        BEGIN
                            RETURN TEMP 50
                        END
                    HLOAD TEMP 133 TEMP 132 0
                    HLOAD TEMP 134 TEMP 133 0
                    RETURN
                    CALL TEMP 134
                    (
                        TEMP 132
                    )
                END
            MOVE TEMP 47
                BEGIN
                    MOVE TEMP 135
                        BEGIN
                            RETURN TEMP 50
                        END
                    HLOAD TEMP 136 TEMP 135 0
                    HLOAD TEMP 137 TEMP 136 36
                    RETURN
                    CALL TEMP 137
                    (
                        TEMP 135
                    )
                END
            MOVE TEMP 45
                BEGIN
                    MOVE TEMP 138
                        BEGIN
                            RETURN TEMP 50
                        END
                    HLOAD TEMP 139 TEMP 138 0
                    HLOAD TEMP 140 TEMP 139 20
                    RETURN
                    CALL TEMP 140
                    (
                        TEMP 138
                    )
                END
            MOVE TEMP 49
                1
            JUMP L25
            L24 NOOP
            MOVE TEMP 46
                0
            L25
            NOOP
        JUMP L18
        L19
        NOOP
        MOVE TEMP 141
        BEGIN
            RETURN TEMP 52
        END
        RETURN TEMP 141
    END
    Size_4_List_Search [ 1 ]
    BEGIN
        MOVE TEMP 41
            0
        MOVE TEMP 40
            TEMP 0
        MOVE TEMP 39
            BEGIN
                HLOAD TEMP 142 TEMP 0 12
                RETURN TEMP 142
            END
        MOVE TEMP 37
            BEGIN
                HLOAD TEMP 143 TEMP 0 4
                RETURN TEMP 143
            END
        L26
         CJUMP 
    MINUS 1 
        BEGIN
            RETURN TEMP 39
        END
        L27
        CJUMP
            BEGIN
                MOVE TEMP 145
                    BEGIN
                        RETURN TEMP 1
                    END
                HLOAD TEMP 146 TEMP 145 0
                HLOAD TEMP 147 TEMP 146 8
                RETURN
                CALL TEMP 147
                (
                    TEMP 145
                    BEGIN
                        RETURN TEMP 37
                    END
                )
            END
            L28
            MOVE TEMP 41
                1
            JUMP L29
            L28 NOOP
            MOVE TEMP 38
                0
            L29
            NOOP
        MOVE TEMP 40
            BEGIN
                MOVE TEMP 148
                    BEGIN
                        RETURN TEMP 40
                    END
                HLOAD TEMP 149 TEMP 148 0
                HLOAD TEMP 150 TEMP 149 0
                RETURN
                CALL TEMP 150
                (
                    TEMP 148
                )
            END
        MOVE TEMP 39
            BEGIN
                MOVE TEMP 151
                    BEGIN
                        RETURN TEMP 40
                    END
                HLOAD TEMP 152 TEMP 151 0
                HLOAD TEMP 153 TEMP 152 36
                RETURN
                CALL TEMP 153
                (
                    TEMP 151
                )
            END
        MOVE TEMP 37
            BEGIN
                MOVE TEMP 154
                    BEGIN
                        RETURN TEMP 40
                    END
                HLOAD TEMP 155 TEMP 154 0
                HLOAD TEMP 156 TEMP 155 20
                RETURN
                CALL TEMP 156
                (
                    TEMP 154
                )
            END
        JUMP L26
        L27
        NOOP
        MOVE TEMP 157
        BEGIN
            RETURN TEMP 41
        END
        RETURN TEMP 157
    END
    Size_4_List_GetEnd [ 0 ]
    BEGIN
        MOVE TEMP 158
        BEGIN
            HLOAD TEMP 159 TEMP 0 12
            RETURN TEMP 159
        END
        RETURN TEMP 158
    END
    Size_4_List_GetElem [ 0 ]
    BEGIN
        MOVE TEMP 160
        BEGIN
            HLOAD TEMP 161 TEMP 0 4
            RETURN TEMP 161
        END
        RETURN TEMP 160
    END
    Size_4_List_GetNext [ 0 ]
    BEGIN
        MOVE TEMP 162
        BEGIN
            HLOAD TEMP 163 TEMP 0 8
            RETURN TEMP 163
        END
        RETURN TEMP 162
    END
    Size_4_List_Print [ 0 ]
    BEGIN
        MOVE TEMP 56
            TEMP 0
        MOVE TEMP 55
            BEGIN
                HLOAD TEMP 164 TEMP 0 12
                RETURN TEMP 164
            END
        MOVE TEMP 54
            BEGIN
                HLOAD TEMP 165 TEMP 0 4
                RETURN TEMP 165
            END
        L30
         CJUMP 
    MINUS 1 
        BEGIN
            RETURN TEMP 55
        END
        L31
        PRINT 
        BEGIN
            MOVE TEMP 167
                BEGIN
                    RETURN TEMP 54
                END
            HLOAD TEMP 168 TEMP 167 0
            HLOAD TEMP 169 TEMP 168 0
            RETURN
            CALL TEMP 169
            (
                TEMP 167
            )
        END
        MOVE TEMP 56
            BEGIN
                MOVE TEMP 170
                    BEGIN
                        RETURN TEMP 56
                    END
                HLOAD TEMP 171 TEMP 170 0
                HLOAD TEMP 172 TEMP 171 0
                RETURN
                CALL TEMP 172
                (
                    TEMP 170
                )
            END
        MOVE TEMP 55
            BEGIN
                MOVE TEMP 173
                    BEGIN
                        RETURN TEMP 56
                    END
                HLOAD TEMP 174 TEMP 173 0
                HLOAD TEMP 175 TEMP 174 36
                RETURN
                CALL TEMP 175
                (
                    TEMP 173
                )
            END
        MOVE TEMP 54
            BEGIN
                MOVE TEMP 176
                    BEGIN
                        RETURN TEMP 56
                    END
                HLOAD TEMP 177 TEMP 176 0
                HLOAD TEMP 178 TEMP 177 20
                RETURN
                CALL TEMP 178
                (
                    TEMP 176
                )
            END
        JUMP L30
        L31
        NOOP
        MOVE TEMP 179
        1
        RETURN TEMP 179
    END
    Size_2_LL_Start [ 0 ]
    BEGIN
        MOVE TEMP 31
            BEGIN
                MOVE TEMP 181 HALLOCATE 16
                MOVE TEMP 182 HALLOCATE 40
                HSTORE TEMP 182 0 Size_4_List_GetNext
                HSTORE TEMP 182 4 Size_4_List_Search
                HSTORE TEMP 182 8 Size_4_List_Insert
                HSTORE TEMP 182 12 Size_4_List_InitNew
                HSTORE TEMP 182 16 Size_4_List_Init
                HSTORE TEMP 182 20 Size_4_List_GetElem
                HSTORE TEMP 182 24 Size_4_List_Delete
                HSTORE TEMP 182 28 Size_4_List_SetNext
                HSTORE TEMP 182 32 Size_4_List_Print
                HSTORE TEMP 182 36 Size_4_List_GetEnd
                MOVE TEMP 183 4
                L32
                CJUMP LT TEMP 183 16 L33
                HSTORE PLUS TEMP 181 TEMP 183 0 0
                MOVE TEMP 183 PLUS TEMP 183 4
                JUMP L32
                L33
                HSTORE TEMP 181 0 TEMP 182
                RETURN TEMP 181
            END
        MOVE TEMP 32
            BEGIN
                MOVE TEMP 184
                    BEGIN
                        RETURN TEMP 31
                    END
                HLOAD TEMP 185 TEMP 184 0
                HLOAD TEMP 186 TEMP 185 16
                RETURN
                CALL TEMP 186
                (
                    TEMP 184
                )
            END
        MOVE TEMP 33
            BEGIN
                RETURN TEMP 31
            END
        MOVE TEMP 32
            BEGIN
                MOVE TEMP 187
                    BEGIN
                        RETURN TEMP 33
                    END
                HLOAD TEMP 188 TEMP 187 0
                HLOAD TEMP 189 TEMP 188 16
                RETURN
                CALL TEMP 189
                (
                    TEMP 187
                )
            END
        MOVE TEMP 32
            BEGIN
                MOVE TEMP 190
                    BEGIN
                        RETURN TEMP 33
                    END
                HLOAD TEMP 191 TEMP 190 0
                HLOAD TEMP 192 TEMP 191 32
                RETURN
                CALL TEMP 192
                (
                    TEMP 190
                )
            END
        MOVE TEMP 36
            BEGIN
                MOVE TEMP 194 HALLOCATE 16
                MOVE TEMP 195 HALLOCATE 24
                HSTORE TEMP 195 0 Size_7_Element_GetAge
                HSTORE TEMP 195 4 Size_7_Element_Init
                HSTORE TEMP 195 8 Size_7_Element_Equal
                HSTORE TEMP 195 12 Size_7_Element_Compare
                HSTORE TEMP 195 16 Size_7_Element_GetMarried
                HSTORE TEMP 195 20 Size_7_Element_GetSalary
                MOVE TEMP 196 4
                L34
                CJUMP LT TEMP 196 16 L35
                HSTORE PLUS TEMP 194 TEMP 196 0 0
                MOVE TEMP 196 PLUS TEMP 196 4
                JUMP L34
                L35
                HSTORE TEMP 194 0 TEMP 195
                RETURN TEMP 194
            END
        MOVE TEMP 32
            BEGIN
                MOVE TEMP 197
                    BEGIN
                        RETURN TEMP 36
                    END
                HLOAD TEMP 198 TEMP 197 0
                HLOAD TEMP 199 TEMP 198 4
                RETURN
                CALL TEMP 199
                (
                    TEMP 197
                    25
                    37000
                    0
                )
            END
        MOVE TEMP 33
            BEGIN
                MOVE TEMP 200
                    BEGIN
                        RETURN TEMP 33
                    END
                HLOAD TEMP 201 TEMP 200 0
                HLOAD TEMP 202 TEMP 201 8
                RETURN
                CALL TEMP 202
                (
                    TEMP 200
                    BEGIN
                        RETURN TEMP 36
                    END
                )
            END
        MOVE TEMP 32
            BEGIN
                MOVE TEMP 203
                    BEGIN
                        RETURN TEMP 33
                    END
                HLOAD TEMP 204 TEMP 203 0
                HLOAD TEMP 205 TEMP 204 32
                RETURN
                CALL TEMP 205
                (
                    TEMP 203
                )
            END
        PRINT 
        10000000
        MOVE TEMP 36
            BEGIN
                MOVE TEMP 207 HALLOCATE 16
                MOVE TEMP 208 HALLOCATE 24
                HSTORE TEMP 208 0 Size_7_Element_GetAge
                HSTORE TEMP 208 4 Size_7_Element_Init
                HSTORE TEMP 208 8 Size_7_Element_Equal
                HSTORE TEMP 208 12 Size_7_Element_Compare
                HSTORE TEMP 208 16 Size_7_Element_GetMarried
                HSTORE TEMP 208 20 Size_7_Element_GetSalary
                MOVE TEMP 209 4
                L36
                CJUMP LT TEMP 209 16 L37
                HSTORE PLUS TEMP 207 TEMP 209 0 0
                MOVE TEMP 209 PLUS TEMP 209 4
                JUMP L36
                L37
                HSTORE TEMP 207 0 TEMP 208
                RETURN TEMP 207
            END
        MOVE TEMP 32
            BEGIN
                MOVE TEMP 210
                    BEGIN
                        RETURN TEMP 36
                    END
                HLOAD TEMP 211 TEMP 210 0
                HLOAD TEMP 212 TEMP 211 4
                RETURN
                CALL TEMP 212
                (
                    TEMP 210
                    39
                    42000
                    1
                )
            END
        MOVE TEMP 35
            BEGIN
                RETURN TEMP 36
            END
        MOVE TEMP 33
            BEGIN
                MOVE TEMP 213
                    BEGIN
                        RETURN TEMP 33
                    END
                HLOAD TEMP 214 TEMP 213 0
                HLOAD TEMP 215 TEMP 214 8
                RETURN
                CALL TEMP 215
                (
                    TEMP 213
                    BEGIN
                        RETURN TEMP 36
                    END
                )
            END
        MOVE TEMP 32
            BEGIN
                MOVE TEMP 216
                    BEGIN
                        RETURN TEMP 33
                    END
                HLOAD TEMP 217 TEMP 216 0
                HLOAD TEMP 218 TEMP 217 32
                RETURN
                CALL TEMP 218
                (
                    TEMP 216
                )
            END
        PRINT 
        10000000
        MOVE TEMP 36
            BEGIN
                MOVE TEMP 220 HALLOCATE 16
                MOVE TEMP 221 HALLOCATE 24
                HSTORE TEMP 221 0 Size_7_Element_GetAge
                HSTORE TEMP 221 4 Size_7_Element_Init
                HSTORE TEMP 221 8 Size_7_Element_Equal
                HSTORE TEMP 221 12 Size_7_Element_Compare
                HSTORE TEMP 221 16 Size_7_Element_GetMarried
                HSTORE TEMP 221 20 Size_7_Element_GetSalary
                MOVE TEMP 222 4
                L38
                CJUMP LT TEMP 222 16 L39
                HSTORE PLUS TEMP 220 TEMP 222 0 0
                MOVE TEMP 222 PLUS TEMP 222 4
                JUMP L38
                L39
                HSTORE TEMP 220 0 TEMP 221
                RETURN TEMP 220
            END
        MOVE TEMP 32
            BEGIN
                MOVE TEMP 223
                    BEGIN
                        RETURN TEMP 36
                    END
                HLOAD TEMP 224 TEMP 223 0
                HLOAD TEMP 225 TEMP 224 4
                RETURN
                CALL TEMP 225
                (
                    TEMP 223
                    22
                    34000
                    0
                )
            END
        MOVE TEMP 33
            BEGIN
                MOVE TEMP 226
                    BEGIN
                        RETURN TEMP 33
                    END
                HLOAD TEMP 227 TEMP 226 0
                HLOAD TEMP 228 TEMP 227 8
                RETURN
                CALL TEMP 228
                (
                    TEMP 226
                    BEGIN
                        RETURN TEMP 36
                    END
                )
            END
        MOVE TEMP 32
            BEGIN
                MOVE TEMP 229
                    BEGIN
                        RETURN TEMP 33
                    END
                HLOAD TEMP 230 TEMP 229 0
                HLOAD TEMP 231 TEMP 230 32
                RETURN
                CALL TEMP 231
                (
                    TEMP 229
                )
            END
        MOVE TEMP 34
            BEGIN
                MOVE TEMP 233 HALLOCATE 16
                MOVE TEMP 234 HALLOCATE 24
                HSTORE TEMP 234 0 Size_7_Element_GetAge
                HSTORE TEMP 234 4 Size_7_Element_Init
                HSTORE TEMP 234 8 Size_7_Element_Equal
                HSTORE TEMP 234 12 Size_7_Element_Compare
                HSTORE TEMP 234 16 Size_7_Element_GetMarried
                HSTORE TEMP 234 20 Size_7_Element_GetSalary
                MOVE TEMP 235 4
                L40
                CJUMP LT TEMP 235 16 L41
                HSTORE PLUS TEMP 233 TEMP 235 0 0
                MOVE TEMP 235 PLUS TEMP 235 4
                JUMP L40
                L41
                HSTORE TEMP 233 0 TEMP 234
                RETURN TEMP 233
            END
        MOVE TEMP 32
            BEGIN
                MOVE TEMP 236
                    BEGIN
                        RETURN TEMP 34
                    END
                HLOAD TEMP 237 TEMP 236 0
                HLOAD TEMP 238 TEMP 237 4
                RETURN
                CALL TEMP 238
                (
                    TEMP 236
                    27
                    34000
                    0
                )
            END
        PRINT 
        BEGIN
            MOVE TEMP 239
                BEGIN
                    RETURN TEMP 33
                END
            HLOAD TEMP 240 TEMP 239 0
            HLOAD TEMP 241 TEMP 240 4
            RETURN
            CALL TEMP 241
            (
                TEMP 239
                BEGIN
                    RETURN TEMP 35
                END
            )
        END
        PRINT 
        BEGIN
            MOVE TEMP 242
                BEGIN
                    RETURN TEMP 33
                END
            HLOAD TEMP 243 TEMP 242 0
            HLOAD TEMP 244 TEMP 243 4
            RETURN
            CALL TEMP 244
            (
                TEMP 242
                BEGIN
                    RETURN TEMP 34
                END
            )
        END
        PRINT 
        10000000
        MOVE TEMP 36
            BEGIN
                MOVE TEMP 246 HALLOCATE 16
                MOVE TEMP 247 HALLOCATE 24
                HSTORE TEMP 247 0 Size_7_Element_GetAge
                HSTORE TEMP 247 4 Size_7_Element_Init
                HSTORE TEMP 247 8 Size_7_Element_Equal
                HSTORE TEMP 247 12 Size_7_Element_Compare
                HSTORE TEMP 247 16 Size_7_Element_GetMarried
                HSTORE TEMP 247 20 Size_7_Element_GetSalary
                MOVE TEMP 248 4
                L42
                CJUMP LT TEMP 248 16 L43
                HSTORE PLUS TEMP 246 TEMP 248 0 0
                MOVE TEMP 248 PLUS TEMP 248 4
                JUMP L42
                L43
                HSTORE TEMP 246 0 TEMP 247
                RETURN TEMP 246
            END
        MOVE TEMP 32
            BEGIN
                MOVE TEMP 249
                    BEGIN
                        RETURN TEMP 36
                    END
                HLOAD TEMP 250 TEMP 249 0
                HLOAD TEMP 251 TEMP 250 4
                RETURN
                CALL TEMP 251
                (
                    TEMP 249
                    28
                    35000
                    0
                )
            END
        MOVE TEMP 33
            BEGIN
                MOVE TEMP 252
                    BEGIN
                        RETURN TEMP 33
                    END
                HLOAD TEMP 253 TEMP 252 0
                HLOAD TEMP 254 TEMP 253 8
                RETURN
                CALL TEMP 254
                (
                    TEMP 252
                    BEGIN
                        RETURN TEMP 36
                    END
                )
            END
        MOVE TEMP 32
            BEGIN
                MOVE TEMP 255
                    BEGIN
                        RETURN TEMP 33
                    END
                HLOAD TEMP 256 TEMP 255 0
                HLOAD TEMP 257 TEMP 256 32
                RETURN
                CALL TEMP 257
                (
                    TEMP 255
                )
            END
        PRINT 
        2220000
        MOVE TEMP 33
            BEGIN
                MOVE TEMP 258
                    BEGIN
                        RETURN TEMP 33
                    END
                HLOAD TEMP 259 TEMP 258 0
                HLOAD TEMP 260 TEMP 259 24
                RETURN
                CALL TEMP 260
                (
                    TEMP 258
                    BEGIN
                        RETURN TEMP 35
                    END
                )
            END
        MOVE TEMP 32
            BEGIN
                MOVE TEMP 261
                    BEGIN
                        RETURN TEMP 33
                    END
                HLOAD TEMP 262 TEMP 261 0
                HLOAD TEMP 263 TEMP 262 32
                RETURN
                CALL TEMP 263
                (
                    TEMP 261
                )
            END
        PRINT 
        33300000
        MOVE TEMP 33
            BEGIN
                MOVE TEMP 264
                    BEGIN
                        RETURN TEMP 33
                    END
                HLOAD TEMP 265 TEMP 264 0
                HLOAD TEMP 266 TEMP 265 24
                RETURN
                CALL TEMP 266
                (
                    TEMP 264
                    BEGIN
                        RETURN TEMP 36
                    END
                )
            END
        MOVE TEMP 32
            BEGIN
                MOVE TEMP 267
                    BEGIN
                        RETURN TEMP 33
                    END
                HLOAD TEMP 268 TEMP 267 0
                HLOAD TEMP 269 TEMP 268 32
                RETURN
                CALL TEMP 269
                (
                    TEMP 267
                )
            END
        PRINT 
        44440000
        MOVE TEMP 270
        0
        RETURN TEMP 270
    END
