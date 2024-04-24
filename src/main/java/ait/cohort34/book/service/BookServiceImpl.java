package ait.cohort34.book.service;

import ait.cohort34.book.dao.AuthorRepository;
import ait.cohort34.book.dao.BookRepository;
import ait.cohort34.book.dao.PublisherRepository;
import ait.cohort34.book.dto.AuthorDto;
import ait.cohort34.book.dto.BookDto;
import ait.cohort34.book.model.Book;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService{

    final BookRepository bookRepository;
    final AuthorRepository authorRepository;
    final PublisherRepository publisherRepository;
    final ModelMapper modelMapper;

    @Transactional
    @Override
    public boolean addBook(BookDto bookDto) {
        if (bookRepository.existsById(bookDto.getIsbn())){
            return false;
        }
        Book book = modelMapper.map(bookDto, Book.class);
        bookRepository.save(book);
        return true;
    }

    @Override
    public BookDto findBookByIsbn(String isbn) {
        return null;
    }

    @Override
    public BookDto remove(String isbn) {
        return null;
    }

    @Override
    public BookDto updateBook(String isbn, String title) {
        return null;
    }

    @Override
    public Iterable<BookDto> findBooksByAuthor(String authorName) {
        return null;
    }

    @Override
    public Iterable<BookDto> findBooksByPublisher(String publisherName) {
        return null;
    }

    @Override
    public Iterable<AuthorDto> findBookAuthors(String isbn) {
        return null;
    }

    @Override
    public Iterable<String> findPublishersByAuthor(String authorName) {
        return null;
    }

    @Override
    public AuthorDto removeAuthor(String authorName) {
        return null;
    }
}
