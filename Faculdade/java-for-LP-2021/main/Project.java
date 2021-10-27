package main;

import cyan.lang.*;
import cyanruntime.*;
import java.io.FileWriter ;
import java.io.PrintWriter;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

class Project { 
	public static String cyanLangJar = "cyan.lang.jar";
	public static String cyanRuntime = "cyanruntime.jar";
	@SuppressWarnings("resource")
	private static void addCYAN_HOME_classPath() {
		String cyanHome = System.getenv("CYAN_HOME");
		if ( cyanHome == null ) {
			System.out.println("cyan home is null");
			return ;
		}
		File f = new File(cyanHome);
		if ( ! f.exists() || !f.isDirectory() ) {
			System.out.println("directory '" + cyanHome +
					"' does not exist. It is as the value of the System variable CYAN_HOME");
			return ;
		}
		File cyanLangJarFile = new File(cyanHome + File.separator + cyanLangJar);
		File cyanRuntimeFile = new File(cyanHome + File.separator + cyanRuntime);
		if ( !cyanLangJarFile.exists() || cyanLangJarFile.isDirectory() ||
			 !cyanRuntimeFile.exists() || cyanRuntimeFile.isDirectory() ) {
			System.out.println("One or two of the following files are missing from directory '"
					+ cyanHome + "': " + cyanLangJar + ", " + cyanRuntime);
			System.exit(1);
		}
		URL []urlArray = new URL[3];
		try {
			urlArray[0] = f.toURI().toURL();
			urlArray[1] = cyanLangJarFile.toURI().toURL();
			urlArray[2] = cyanRuntimeFile.toURI().toURL();

			ClassLoader prevCl = Thread.currentThread().getContextClassLoader();
			ClassLoader urlCl = URLClassLoader.newInstance(urlArray, prevCl);
			Thread.currentThread().setContextClassLoader(urlCl);
           @SuppressWarnings("unused")			cyan.lang._ExceptionReadFormat notUsed_var;
		}
		catch (MalformedURLException  e) {
			System.out.println("Error in transforming the directory "
					+ "given by environment variable CYAN_HOME into a URL");
			System.exit(1);
		}

	}



    public static void main(String []args) { 
        addCYAN_HOME_classPath();
        try { 
        (new main._Program())._run();
        }
        catch ( IndexOutOfBoundsException  e ) {

            e.printStackTrace();
            System.out.println("Index of array out of bounds. Remember that you cannot add "

              + " an element to an array using indexing like in\n"

              + "    var v = Array<Int> new: 10;\n    v[0] = 5;\n"

              + "This results in the exception 'ExceptionIndexOutOfBounds'. You should use method 'add:' instead:\n"

             + "    var v = Array<Int> new: 10;\n    v add: 5;\n");

            System.out.println("This same error occurs when using method 'add:' as in\n    v add: 5, 0;\n");
        }
        catch (Throwable e) {
            System.out.flush();
            if ( e instanceof ExceptionContainer__ ) {
                String messageToWrite = null;
                if ( ((ExceptionContainer__) e).elem instanceof _ExceptionMethodNotFound ) {
                    _ExceptionMethodNotFound e1 = (_ExceptionMethodNotFound ) ((ExceptionContainer__) e).elem;
                    if ( e1._message() != null && e1._message().s.length() > 0 ) {
                        messageToWrite = e1._message().s;
                    }
                    else {
                        System.out.println("Method was not found. Exception _ExceptionMethodNotFound was thrown but not caught");
                    }
                }
                else if ( ((ExceptionContainer__) e).elem instanceof _ExceptionCast) {
                    _ExceptionCast e1 = (_ExceptionCast ) ((ExceptionContainer__) e).elem;
                    if ( e1._message() != null && e1._message().s.length() > 0 ) {
                        messageToWrite = e1._message().s;
                    }
                }
                if ( messageToWrite != null )
                    System.out.println(messageToWrite);
                else
                    System.out.println("Exception " + ((ExceptionContainer__)  e).elem.getClass().getName() + " was thrown but not caught");
            }
            else {
                System.out.println("Java exception " + e.getClass().getName() + " was thrown but not caught");
            }
            System.out.flush();
            e.printStackTrace();
        }
    }
}
