package com.xworkz.exception.checkedexception;

import java.awt.color.CMMException;
import java.awt.color.ProfileDataException;
import java.lang.annotation.AnnotationTypeMismatchException;
import java.lang.ArithmeticException;
import java.lang.ArrayStoreException;
import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import javax.lang.model.UnknownEntityException;
import javax.print.attribute.UnmodifiableSetException;
import javax.swing.undo.CannotRedoException;
import javax.swing.undo.CannotUndoException;
import java.lang.ClassCastException;
import java.nio.file.ProviderNotFoundException;
import java.util.concurrent.CompletionException;
import java.util.ConcurrentModificationException;
import javax.xml.bind.DataBindingException;
import java.time.DateTimeException;
import org.w3c.dom.DOMException;
import java.util.EmptyStackException;
import java.lang.EnumConstantNotPresentException;
import org.w3c.dom.events.EventException;
import java.nio.file.FileSystemAlreadyExistsException;
import java.nio.file.FileSystemNotFoundException;
import java.lang.IllegalArgumentException;
import java.lang.IllegalMonitorStateException;
import java.awt.geom.IllegalPathStateException;
import java.lang.IllegalStateException;
import java.util.IllformedLocaleException;
import java.awt.image.ImagingOpException;
import java.lang.annotation.IncompleteAnnotationException;
import java.lang.IndexOutOfBoundsException;
import javax.management.JMRuntimeException;
import org.w3c.dom.ls.LSException;
import java.lang.reflect.MalformedParameterizedTypeException;
import java.lang.reflect.MalformedParametersException;
import javax.lang.model.type.MirroredTypesException;
import java.util.MissingResourceException;
import java.lang.NegativeArraySizeException;
import java.util.NoSuchElementException;
import javax.xml.bind.TypeConstraintException;
import javax.xml.crypto.NoSuchMechanismException;
import java.lang.NullPointerException;
import java.security.ProviderException;
import java.awt.image.RasterFormatException;
import java.util.concurrent.RejectedExecutionException;
import java.lang.SecurityException;
import org.omg.CORBA.SystemException;
import java.lang.TypeNotPresentException;
import java.io.UncheckedIOException;
import java.lang.reflect.UndeclaredThrowableException;
import java.lang.UnsupportedOperationException;
import javax.xml.ws.WebServiceException;
import java.lang.invoke.WrongMethodTypeException;

public class RunTime {

    public void annotationTypeMismatchException() throws AnnotationTypeMismatchException {
        System.out.println("AnnotationTypeMismatchException");
        throw new AnnotationTypeMismatchException(null, "AnnotationTypeMismatchException");
    }

    public void arithmeticException() throws ArithmeticException {
        System.out.println("ArithmeticException");
        throw new ArithmeticException("ArithmeticException");
    }

    public void arrayStoreException() throws ArrayStoreException {
        System.out.println("ArrayStoreException");
        throw new ArrayStoreException("ArrayStoreException");
    }

    public void bufferOverflowException() throws BufferOverflowException {
        System.out.println("BufferOverflowException");
        throw new BufferOverflowException();
    }

    public void bufferUnderflowException() throws BufferUnderflowException {
        System.out.println("BufferUnderflowException");
        throw new BufferUnderflowException();
    }

    public void cannotRedoException() throws CannotRedoException {
        System.out.println("CannotRedoException");
        throw new CannotRedoException();
    }

    public void cannotUndoException() throws CannotUndoException {
        System.out.println("CannotUndoException");
        throw new CannotUndoException();
    }

    public void classCastException() throws ClassCastException {
        System.out.println("ClassCastException");
        throw new ClassCastException("ClassCastException");
    }

    public void cmmException() throws CMMException {
        System.out.println("CMMException");
        throw new CMMException("CMMException");
    }

    public void completionException() throws CompletionException {
        System.out.println("CompletionException");
        throw new CompletionException("CompletionException", null);
    }

    public void concurrentModificationException() throws ConcurrentModificationException {
        System.out.println("ConcurrentModificationException");
        throw new ConcurrentModificationException();
    }

    public void dataBindingException() throws DataBindingException {
        System.out.println("DataBindingException");
        throw new DataBindingException("DataBindingException");
    }

    public void dateTimeException() throws DateTimeException {
        System.out.println("DateTimeException");
        throw new DateTimeException("DateTimeException");
    }

    public void domException() throws DOMException {
        System.out.println("DOMException");
        throw new DOMException(DOMException.SYNTAX_ERR, "DOMException");
    }

    public void emptyStackException() throws EmptyStackException {
        System.out.println("EmptyStackException");
        throw new EmptyStackException();
    }

    public void enumConstantNotPresentException() throws EnumConstantNotPresentException {
        System.out.println("EnumConstantNotPresentException");
        throw new EnumConstantNotPresentException(null, "EnumConstantNotPresentException");
    }

    public void eventException() throws EventException {
        System.out.println("EventException");
        throw new EventException(EventException.UNSPECIFIED_EVENT_TYPE_ERR, "EventException");
    }

    public void fileSystemAlreadyExistsException() throws FileSystemAlreadyExistsException {
        System.out.println("FileSystemAlreadyExistsException");
        throw new FileSystemAlreadyExistsException();
    }

    public void fileSystemNotFoundException() throws FileSystemNotFoundException {
        System.out.println("FileSystemNotFoundException");
        throw new FileSystemNotFoundException();
    }

    public void illegalArgumentException() throws IllegalArgumentException {
        System.out.println("IllegalArgumentException");
        throw new IllegalArgumentException("IllegalArgumentException");
    }

    public void illegalMonitorStateException() throws IllegalMonitorStateException {
        System.out.println("IllegalMonitorStateException");
        throw new IllegalMonitorStateException("IllegalMonitorStateException");
    }

    public void illegalPathStateException() throws IllegalPathStateException {
        System.out.println("IllegalPathStateException");
        throw new IllegalPathStateException("IllegalPathStateException");
    }

    public void illegalStateException() throws IllegalStateException {
        System.out.println("IllegalStateException");
        throw new IllegalStateException("IllegalStateException");
    }

    public void illformedLocaleException() throws IllformedLocaleException {
        System.out.println("IllformedLocaleException");
        throw new IllformedLocaleException("IllformedLocaleException");
    }

    public void imagingOpException() throws ImagingOpException {
        System.out.println("ImagingOpException");
        throw new ImagingOpException("ImagingOpException");
    }

    public void incompleteAnnotationException() throws IncompleteAnnotationException {
        System.out.println("IncompleteAnnotationException");
        throw new IncompleteAnnotationException(null, "IncompleteAnnotationException");
    }

    public void indexOutOfBoundsException() throws IndexOutOfBoundsException {
        System.out.println("IndexOutOfBoundsException");
        throw new IndexOutOfBoundsException("IndexOutOfBoundsException");
    }

    public void jmRuntimeException() throws JMRuntimeException {
        System.out.println("JMRuntimeException");
        throw new JMRuntimeException("JMRuntimeException");
    }

    public void lsException() throws LSException {
        System.out.println("LSException");
        throw new LSException((short) 0, "LSException");
    }

    public void malformedParameterizedTypeException() throws MalformedParameterizedTypeException {
        System.out.println("MalformedParameterizedTypeException");
        throw new MalformedParameterizedTypeException();
    }

    public void malformedParametersException() throws MalformedParametersException {
        System.out.println("MalformedParametersException");
        throw new MalformedParametersException();
    }

    public void mirroredTypesException() throws MirroredTypesException {
        System.out.println("MirroredTypesException");
        throw new MirroredTypesException(null);
    }

    public void missingResourceException() throws MissingResourceException {
        System.out.println("MissingResourceException");
        throw new MissingResourceException("MissingResourceException", "className", "key");
    }

    public void negativeArraySizeException() throws NegativeArraySizeException {
        System.out.println("NegativeArraySizeException");
        throw new NegativeArraySizeException("NegativeArraySizeException");
    }

    public void noSuchElementException() throws NoSuchElementException {
        System.out.println("NoSuchElementException");
        throw new NoSuchElementException("NoSuchElementException");
    }

    public void noSuchMechanismException() throws NoSuchMechanismException {
        System.out.println("NoSuchMechanismException");
        throw new NoSuchMechanismException("NoSuchMechanismException");
    }

    public void nullPointerException() throws NullPointerException {
        System.out.println("NullPointerException");
        throw new NullPointerException("NullPointerException");
    }

    public void profileDataException() throws ProfileDataException {
        System.out.println("ProfileDataException");
        throw new ProfileDataException("ProfileDataException");
    }

    public void providerException() throws ProviderException {
        System.out.println("ProviderException");
        throw new ProviderException("ProviderException");
    }

    public void providerNotFoundException() throws ProviderNotFoundException {
        System.out.println("ProviderNotFoundException");
        throw new ProviderNotFoundException("ProviderNotFoundException");
    }

    public void rasterFormatException() throws RasterFormatException {
        System.out.println("RasterFormatException");
        throw new RasterFormatException("RasterFormatException");
    }

    public void rejectedExecutionException() throws RejectedExecutionException {
        System.out.println("RejectedExecutionException");
        throw new RejectedExecutionException("RejectedExecutionException");
    }

    public void securityException() throws SecurityException {
        System.out.println("SecurityException");
        throw new SecurityException("SecurityException");
    }

    public void systemException() throws SystemException {
        System.out.println("SystemException");
        throw new SystemException();
    }

    public void typeConstraintException() throws TypeConstraintException {
        System.out.println("TypeConstraintException");
        throw new TypeConstraintException("TypeConstraintException");
    }

    public void typeNotPresentException() throws TypeNotPresentException {
        System.out.println("TypeNotPresentException");
        throw new TypeNotPresentException("TypeNotPresentException", null);
    }

    public void uncheckedIOException() throws UncheckedIOException {
        System.out.println("UncheckedIOException");
        throw new UncheckedIOException("UncheckedIOException", null);
    }

    public void undeclaredThrowableException() throws UndeclaredThrowableException {
        System.out.println("UndeclaredThrowableException");
        throw new UndeclaredThrowableException(new Throwable("UndeclaredThrowableException"));
    }

    public void unknownEntityException() throws UnknownEntityException {
        System.out.println("UnknownEntityException");
        throw new UnknownEntityException("UnknownEntityException");
    }

    public void unmodifiableSetException() throws UnmodifiableSetException {
        System.out.println("UnmodifiableSetException");
        throw new UnmodifiableSetException("UnmodifiableSetException");
    }

    public void unsupportedOperationException() throws UnsupportedOperationException {
        System.out.println("UnsupportedOperationException");
        throw new UnsupportedOperationException("UnsupportedOperationException");
    }

    public void webServiceException() throws WebServiceException {
        System.out.println("WebServiceException");
        throw new WebServiceException("WebServiceException");
    }

    public void wrongMethodTypeException() throws WrongMethodTypeException {
        System.out.println("WrongMethodTypeException");
        throw new WrongMethodTypeException("WrongMethodTypeException");
    }
}
