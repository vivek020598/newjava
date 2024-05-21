package com.xworkz.exception.checkedexception;

import java.awt.datatransfer.UnsupportedFlavorException;
import java.lang.instrument.UnmodifiableClassException;
import java.rmi.server.ServerNotActiveException;
import java.security.acl.AclNotFoundException;
import java.awt.AWTException;
import java.awt.FontFormatException;
import java.beans.IntrospectionException;
import java.io.IOException;
import java.lang.instrument.IllegalClassFormatException;
import java.rmi.AlreadyBoundException;
import java.rmi.activation.ActivationException;
import java.security.GeneralSecurityException;
import java.security.cert.CertificateException;
import java.sql.SQLException;
import java.util.TooManyListenersException;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import java.util.prefs.BackingStoreException;
import java.util.prefs.InvalidPreferencesFormatException;
import javax.jnlp.UnavailableServiceException;
import javax.management.*;
import javax.management.modelmbean.InvalidTargetObjectTypeException;
import javax.security.auth.callback.UnsupportedCallbackException;
import javax.sound.midi.InvalidMidiDataException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.xml.bind.JAXBException;
import javax.xml.crypto.URIReferenceException;
import javax.xml.crypto.dsig.TransformException;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.swing.text.BadLocationException;
import javax.xml.soap.SOAPException;
import javax.xml.transform.TransformerException;
import javax.management.JMException;
import javax.xml.crypto.KeySelectorException;
import java.lang.invoke.LambdaConversionException;
import java.security.acl.LastOwnerException;
import javax.sound.sampled.LineUnavailableException;
import java.rmi.MarshalException;
import javax.sound.midi.MidiUnavailableException;
import javax.activation.MimeTypeParseException;
import javax.naming.NamingException;
import java.awt.geom.NoninvertibleTransformException;
import java.rmi.NotBoundException;
import java.security.acl.NotOwnerException;
import java.text.ParseException;
import javax.xml.parsers.ParserConfigurationException;
import java.awt.print.PrinterException;
import javax.print.PrintException;
import java.security.PrivilegedActionException;
import java.beans.PropertyVetoException;
import java.lang.ReflectiveOperationException;
import javax.security.auth.RefreshFailedException;
import org.xml.sax.SAXException;
import javax.script.ScriptException;
import javax.swing.UnsupportedLookAndFeelException;
import javax.xml.crypto.URIReferenceException;
import java.net.URISyntaxException;
import org.omg.CORBA.UserException;
import javax.transaction.xa.XAException;
import javax.xml.crypto.dsig.XMLSignatureException;
import javax.xml.stream.XMLStreamException;
import javax.xml.xpath.XPathException;

public class Exception extends Throwable {
    public void absentInformationException() throws AbsentInformationException{
        System.out.println("AbsentInformationException");
        throw new AbsentInformationException();
    }

    public void aclNotFoundException() throws AclNotFoundException{
        System.out.println("AclNotFoundException, ");
        throw new AclNotFoundException();
    }
    public class ExceptionGenerator {
        public void activationException() throws ActivationException {
            System.out.println("ActivationException");
            throw new ActivationException();
        }
        public void agentInitializationException() throws ExecutionControl.ExecutionControlException {
            System.out.println("AgentInitializationException");
            throw new ExecutionControl.ExecutionControlException();
        }

        public void agentLoadException() throws ExecutionControl.ExecutionControlException {
            System.out.println("AgentLoadException");
            throw new ExecutionControl.ExecutionControlException();
        }

        public void alreadyBoundException() throws AlreadyBoundException {
            System.out.println("AlreadyBoundException");
            throw new AlreadyBoundException();
        }

        public void applicationException() throws Exception {
            System.out.println("ApplicationException");
            throw new Exception();
        }

        public void attachNotSupportedException() throws IOException {
            System.out.println("AttachNotSupportedException");
            throw new IOException("Attach Not Supported");
        }

        public void awtException() throws AWTException {
            System.out.println("AWTException");
            throw new AWTException("AWTException");
        }

        public void backingStoreException() throws BackingStoreException {
            System.out.println("BackingStoreException");
            throw new BackingStoreException("BackingStoreException");
        }

        public void badAttributeValueExpException() throws BadAttributeValueExpException {
            System.out.println("BadAttributeValueExpException");
            throw new BadAttributeValueExpException("BadAttributeValueExpException");
        }

        public void badBinaryOpValueExpException() throws BadBinaryOpValueExpException {
            System.out.println("BadBinaryOpValueExpException");
            throw new BadBinaryOpValueExpException();
        }

        public void badLocationException() throws BadLocationException {
            System.out.println("BadLocationException");
            throw new BadLocationException("BadLocationException", 0);
        }

        public void badStringOperationException() throws BadStringOperationException {
            System.out.println("BadStringOperationException");
            throw new BadStringOperationException("BadStringOperationException");
        }

        public void brokenBarrierException() throws BrokenBarrierException {
            System.out.println("BrokenBarrierException");
            throw new BrokenBarrierException("BrokenBarrierException");
        }

        public void cardException() throws Exception {
            System.out.println("CardException");
            throw new Exception();
        }

        public void certificateException() throws CertificateException {
            System.out.println("CertificateException");
            throw new CertificateException("CertificateException");
        }

        public void classNotLoadedException() throws ClassNotLoadedException {
            System.out.println("ClassNotLoadedException");
            throw new ClassNotLoadedException();
        }

        public void cloneNotSupportedException() throws CloneNotSupportedException {
            System.out.println("CloneNotSupportedException");
            throw new CloneNotSupportedException("CloneNotSupportedException");
        }

        public void dataFormatException() throws DataFormatException {
            System.out.println("DataFormatException");
            throw new DataFormatException("DataFormatException");
        }

        public void datatypeConfigurationException() throws DatatypeConfigurationException {
            System.out.println("DatatypeConfigurationException");
            throw new DatatypeConfigurationException("DatatypeConfigurationException");
        }

        public void destroyFailedException() throws Exception {
            System.out.println("DestroyFailedException");
            throw new Exception();
        }

        public void executionControlException() throws ExecutionControlException {
            System.out.println("ExecutionControlException");
            throw new ExecutionControlException("ExecutionControlException");
        }

        public void executionException() throws ExecutionException {
            System.out.println("ExecutionException");
            throw new ExecutionException("ExecutionException", new Throwable());
        }

        public void expandVetoException() throws ExpandVetoException {
            System.out.println("ExpandVetoException");
            throw new ExpandVetoException(null);
        }

        public void fontFormatException() throws FontFormatException {
            System.out.println("FontFormatException");
            throw new FontFormatException("FontFormatException");
        }

        public void generalSecurityException() throws GeneralSecurityException {
            System.out.println("GeneralSecurityException");
            throw new GeneralSecurityException("GeneralSecurityException");
        }

        public void gssException() throws Exception {
            System.out.println("GSSException");
            throw new Exception();
        }

        public void illegalClassFormatException() throws IllegalClassFormatException {
            System.out.println("IllegalClassFormatException");
            throw new IllegalClassFormatException("IllegalClassFormatException");
        }

        public void illegalConnectorArgumentsException() throws IllegalConnectorArgumentsException {
            System.out.println("IllegalConnectorArgumentsException");
            throw new IllegalConnectorArgumentsException("IllegalConnectorArgumentsException");
        }

        public void incompatibleThreadStateException() throws IncompatibleThreadStateException {
            System.out.println("IncompatibleThreadStateException");
            throw new IncompatibleThreadStateException("IncompatibleThreadStateException");
        }

        public void interruptedException() throws InterruptedException {
            System.out.println("InterruptedException");
            throw new InterruptedException("InterruptedException");
        }

        public void introspectionException() throws IntrospectionException {
            System.out.println("IntrospectionException");
            throw new IntrospectionException("IntrospectionException");
        }

        public void invalidApplicationException() throws InvalidApplicationException {
            System.out.println("InvalidApplicationException");
            throw new InvalidApplicationException("InvalidApplicationException");
        }

        public void invalidMidiDataException() throws InvalidMidiDataException {
            System.out.println("InvalidMidiDataException");
            throw new InvalidMidiDataException("InvalidMidiDataException");
        }

        public void invalidPreferencesFormatException() throws InvalidPreferencesFormatException {
            System.out.println("InvalidPreferencesFormatException");
            throw new InvalidPreferencesFormatException("InvalidPreferencesFormatException");
        }

        public void invalidTargetObjectTypeException() throws InvalidTargetObjectTypeException {
            System.out.println("InvalidTargetObjectTypeException");
            throw new InvalidTargetObjectTypeException("InvalidTargetObjectTypeException");
        }

        public void invalidTypeException() throws Exception {
            System.out.println("InvalidTypeException");
            throw new Exception();
        }

        public void invocationException() throws InvocationException {
            System.out.println("InvocationException");
            throw new InvocationException("InvocationException");
        }

        public void ioException() throws IOException {
            System.out.println("IOException");
            throw new IOException("IOException");
        }

        public void jaxbException() throws JAXBException {
            System.out.println("JAXBException");
            throw new JAXBException("JAXBException");

        }
        public void jmException() throws JMException {
            System.out.println("JMException");
            throw new JMException("JMException");
        }

        public void jshellException() throws JShellException {
            System.out.println("JShellException");
            throw new JShellException("JShellException");
        }

        public void keySelectorException() throws KeySelectorException {
            System.out.println("KeySelectorException");
            throw new KeySelectorException("KeySelectorException");
        }

        public void lambdaConversionException() throws LambdaConversionException {
            System.out.println("LambdaConversionException");
            throw new LambdaConversionException("LambdaConversionException");
        }

        public void lastOwnerException() throws LastOwnerException {
            System.out.println("LastOwnerException");
            throw new LastOwnerException();
        }

        public void lineUnavailableException() throws LineUnavailableException {
            System.out.println("LineUnavailableException");
            throw new LineUnavailableException("LineUnavailableException");
        }

        public void marshalException() throws MarshalException {
            System.out.println("MarshalException");
            throw new MarshalException("MarshalException");
        }

        public void midiUnavailableException() throws MidiUnavailableException {
            System.out.println("MidiUnavailableException");
            throw new MidiUnavailableException("MidiUnavailableException");
        }

        public void mimeTypeParseException() throws MimeTypeParseException {
            System.out.println("MimeTypeParseException");
            throw new MimeTypeParseException("MimeTypeParseException");
        }

        public void namingException() throws NamingException {
            System.out.println("NamingException");
            throw new NamingException("NamingException");
        }

        public void noninvertibleTransformException() throws NoninvertibleTransformException {
            System.out.println("NoninvertibleTransformException");
            throw new NoninvertibleTransformException("NoninvertibleTransformException");
        }

        public void notBoundException() throws NotBoundException {
            System.out.println("NotBoundException");
            throw new NotBoundException("NotBoundException");
        }

        public void notOwnerException() throws NotOwnerException {
            System.out.println("NotOwnerException");
            throw new NotOwnerException("NotOwnerException");
        }

        public void parseException() throws ParseException {
            System.out.println("ParseException");
            throw new ParseException("ParseException", 0);
        }

        public void parserConfigurationException() throws ParserConfigurationException {
            System.out.println("ParserConfigurationException");
            throw new ParserConfigurationException("ParserConfigurationException");
        }

        public void printerException() throws PrinterException {
            System.out.println("PrinterException");
            throw new PrinterException("PrinterException");
        }

        public void printException() throws PrintException {
            System.out.println("PrintException");
            throw new PrintException("PrintException");
        }

        public void privilegedActionException() throws PrivilegedActionException {
            System.out.println("PrivilegedActionException");
            throw new PrivilegedActionException(new Exception("PrivilegedActionException"));
        }

        public void propertyVetoException() throws PropertyVetoException {
            System.out.println("PropertyVetoException");
            throw new PropertyVetoException("PropertyVetoException", null);
        }

        public void reflectiveOperationException() throws ReflectiveOperationException {
            System.out.println("ReflectiveOperationException");
            throw new ReflectiveOperationException("ReflectiveOperationException");
        }

        public void refreshFailedException() throws RefreshFailedException {
            System.out.println("RefreshFailedException");
            throw new RefreshFailedException("RefreshFailedException");
        }

        public void remarshalException() throws RemarshalException {
            System.out.println("RemarshalException");
            throw new RemarshalException("RemarshalException");
        }

        public void runtimeException() throws RuntimeException {
            System.out.println("RuntimeException");
            throw new RuntimeException("RuntimeException");
        }

        public void saxException() throws SAXException {
            System.out.println("SAXException");
            throw new SAXException("SAXException");
        }

        public void scriptException() throws ScriptException {
            System.out.println("ScriptException");
            throw new ScriptException("ScriptException");
        }

        public void serverNotActiveException() throws ServerNotActiveException {
            System.out.println("ServerNotActiveException");
            throw new ServerNotActiveException("ServerNotActiveException");
        }

        public void soapException() throws SOAPException {
            System.out.println("SOAPException");
            throw new SOAPException();
        }

        public void sqlException() throws SQLException {
            System.out.println("SQLException");
            throw new SQLException("SQLException");
        }

        public void stringConcatException() throws StringConcatException {
            System.out.println("StringConcatException");
            throw new StringConcatException("StringConcatException");
        }

        public void timeoutException() throws TimeoutException {
            System.out.println("TimeoutException");
            throw new TimeoutException("TimeoutException");
        }

        public void tooManyListenersException() throws TooManyListenersException {
            System.out.println("TooManyListenersException");
            throw new TooManyListenersException("TooManyListenersException");
        }

        public void transformerException() throws TransformerException {
            System.out.println("TransformerException");
            throw new TransformerException("TransformerException");
        }

        public void transformException() throws TransformException {
            System.out.println("TransformException");
            throw new TransformException("TransformException");
        }

        public void unavailableServiceException() throws UnavailableServiceException {
            System.out.println("UnavailableServiceException");
            throw new UnavailableServiceException("UnavailableServiceException");
        }

        public void unmodifiableClassException() throws UnmodifiableClassException {
            System.out.println("UnmodifiableClassException");
            throw new UnmodifiableClassException("UnmodifiableClassException");
        }

        public void unsupportedAudioFileException() throws UnsupportedAudioFileException {
            System.out.println("UnsupportedAudioFileException");
            throw new UnsupportedAudioFileException("UnsupportedAudioFileException");
        }

        public void unsupportedCallbackException() throws UnsupportedCallbackException {
            System.out.println("UnsupportedCallbackException");
            throw new UnsupportedCallbackException(null, "UnsupportedCallbackException");
        }

        public void unsupportedFlavorException() throws UnsupportedFlavorException {
            System.out.println("UnsupportedFlavorException");
            throw new UnsupportedFlavorException("UnsupportedFlavorException");
        }

        public void unsupportedLookAndFeelException() throws UnsupportedLookAndFeelException {
            System.out.println("UnsupportedLookAndFeelException");
            throw new UnsupportedLookAndFeelException("UnsupportedLookAndFeelException");
        }

        public void uriReferenceException() throws URIReferenceException {
            System.out.println("URIReferenceException");
            throw new URIReferenceException("URIReferenceException");
        }

        public void uriSyntaxException() throws URISyntaxException {
            System.out.println("URISyntaxException");
            throw new URISyntaxException("example", "URISyntaxException");
        }

        public void userException() throws UserException {
            System.out.println("UserException");
            throw new UserException();
        }

        public void vmStartException() throws VMStartException {
            System.out.println("VMStartException");
            throw new VMStartException("VMStartException");
        }

        public void xaException() throws XAException {
            System.out.println("XAException");
            throw new XAException("XAException");
        }

        public void xmlParseException() throws XMLParseException {
            System.out.println("XMLParseException");
            throw new XMLParseException("XMLParseException");
        }

        public void xmlSignatureException() throws XMLSignatureException {
            System.out.println("XMLSignatureException");
            throw new XMLSignatureException("XMLSignatureException");
        }

        public void xmlStreamException() throws XMLStreamException {
            System.out.println("XMLStreamException");
            throw new XMLStreamException("XMLStreamException");
        }

        public void xPathException() throws XPathException {
            System.out.println("XPathException");
            throw new XPathException("XPathException");
        }
    }
}

