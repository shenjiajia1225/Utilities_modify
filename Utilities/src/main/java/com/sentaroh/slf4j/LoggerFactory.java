package com.sentaroh.slf4j;

/*
The MIT License (MIT)
Copyright (c) 2018 Sentaroh

Permission is hereby granted, free of charge, to any person obtaining a copy of
this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights to use,
copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software,
and to permit persons to whom the Software is furnished to do so, subject to
the following conditions:

The above copyright notice and this permission notice shall be included in all copies or
substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED,
INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR
PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT,
TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
OTHER DEALINGS IN THE SOFTWARE.

*/


public class LoggerFactory {
	private static LoggerOption logger_option=new LoggerOption();
	public static Logger getLogger(Class log_class) {
		return new Logger(log_class, logger_option);
	}
}
class LoggerOption {
	static public LoggerWriter logWriter=new LoggerWriter();//null;

	static public boolean debugEnabled=false;
	static public boolean errorEnabled=false;
	static public boolean infoEnabled=false;
	static public boolean traceEnabled=false; 
	static public boolean warnEnabled=false;
	static public boolean appendTime=false;
}

