package lt.techin.kristina.blogging.api.dto.mapper;

import lt.techin.kristina.blogging.api.dto.BlogEntryDto;
import lt.techin.kristina.blogging.api.model.BlogEntry;

public class BlogEntryMapper {


    public static BlogEntry toBlogEntry(BlogEntryDto blogEntryDto) {

        BlogEntry blogEntry = new BlogEntry();
        blogEntry.setTitle(blogEntryDto.getTitle());
        blogEntry.setText(blogEntryDto.getText());

        return blogEntry;
    }

    public static BlogEntryDto blogEntryDto(BlogEntry blogEntry) {

        BlogEntryDto blogEntryDto = new BlogEntryDto();
        blogEntryDto.setTitle(blogEntry.getTitle());
        blogEntryDto.setText(blogEntryDto.getText());

        return blogEntryDto;
    }
}
