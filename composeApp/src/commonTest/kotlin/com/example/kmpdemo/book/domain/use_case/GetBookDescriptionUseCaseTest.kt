package com.example.kmpdemo.book.domain.use_case

import com.example.kmpdemo.book.presentation.booklist.FakeBookRepository
import com.example.kmpdemo.core.domain.Result
import kotlinx.coroutines.test.runTest
import kotlin.test.BeforeTest
import kotlin.test.Test
import kotlin.test.assertEquals

class GetBookDescriptionUseCaseTest {

    private lateinit var getBookDescriptionUseCase: GetBookDescriptionUseCase
    private lateinit var repository: FakeBookRepository


    @BeforeTest
    fun setUp() {
        repository = FakeBookRepository()
        getBookDescriptionUseCase = GetBookDescriptionUseCase(repository)
    }

    @Test
    fun `returns book description from repository`() = runTest {
        val result = getBookDescriptionUseCase("1")
        
        assert(result is Result.Success)
        assertEquals("", (result as Result.Success).data)
    }
}
