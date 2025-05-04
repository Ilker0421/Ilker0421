package library.model;

import library.core.LibrarySystem;

public interface Command
{
    public void execute(String[] args, LibrarySystem system);
}
