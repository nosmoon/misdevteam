<%@page contentType="text/html" %>
<%@page import="import java.util.*, import weblogic.jdbc.wrapper.*" %>

<%
	String debugVersion = weblogic.jdbc.wrapper.PoolConnection.debugVersion;
	boolean debug = weblogic.jdbc.wrapper.PoolConnection.debug;
	boolean debugStdout = weblogic.jdbc.wrapper.PoolConnection.debugStdout;
	boolean debugFile = weblogic.jdbc.wrapper.PoolConnection.debugFile;
	String debugLogName = weblogic.jdbc.wrapper.PoolConnection.debugLogName;
	Map debugConns = weblogic.jdbc.wrapper.PoolConnection.debugConns;
	long periodicStackDumpSecs = weblogic.jdbc.wrapper.PoolConnection.periodMilliSecs / 1000;

	String PM_post = request.getParameter("post");
	String PM_conn = request.getParameter("conn");
	String PM_viewStack = request.getParameter("viewStack");
	String PM_debug = request.getParameter("debug");
	String PM_debugStdout = request.getParameter("debugStdout");
	String PM_debugFile = request.getParameter("debugFile");
	String PM_debugLogName = request.getParameter("debugLogName");
	String PM_refreshSeconds = request.getParameter("refreshSeconds");
	String PM_periodicStackDumpSecs = request.getParameter("periodicStackDumpSecs");

	if(PM_post != null) {
		debug = "TRUE".equals(PM_debug);
		debugStdout = "TRUE".equals(PM_debugStdout);
		debugFile = "TRUE".equals(PM_debugFile);
		debugLogName = PM_debugLogName;
		try {
			periodicStackDumpSecs = Long.parseLong(PM_periodicStackDumpSecs);
		}
		catch(Exception e) {
			periodicStackDumpSecs = -1;
		}
	}

	if(PM_conn != null) {
		Iterator it = debugConns.keySet().iterator();
		while(it.hasNext()) {
			String strConn = (String)it.next();
			if(PM_conn.equals(strConn)) {
				Object[] values = (Object[])debugConns.get(strConn);
				Object conn = ((java.lang.ref.WeakReference)values[0]).get();

				System.out.println("***** FOUND Connection : " + conn + ". It'll be closed");

				if(conn instanceof PoolConnection) {
					((PoolConnection)conn).close();
				}
				else if(conn instanceof JTSConnection) {
					((JTSConnection)conn).close();
				}
				else if(conn instanceof JTAConnection) {
					((JTAConnection)conn).close();
				}

				break;
			}
		}
	}

	if(periodicStackDumpSecs > 0) {
		weblogic.jdbc.wrapper.PoolConnection$DebugPeriodicStackDumpThread.begin(periodicStackDumpSecs * 1000, debugLogName);
	}
	else {
		weblogic.jdbc.wrapper.PoolConnection$DebugPeriodicStackDumpThread.end();
	}

	weblogic.jdbc.wrapper.PoolConnection.debug = debug;
	weblogic.jdbc.wrapper.PoolConnection.debugStdout = debugStdout;
	weblogic.jdbc.wrapper.PoolConnection.debugFile = debugFile;
	weblogic.jdbc.wrapper.PoolConnection.debugLogName = debugLogName;
%>

<HTML>

<%
	if(PM_refreshSeconds != null) {
		if(!PM_refreshSeconds.trim().equals("0")) {
%>

			<META HTTP-EQUIV=REFRESH CONTENT= '<%= PM_refreshSeconds %>'>

<%
		}
	}
%>

<BODY>

<h2><%= debugVersion %></h2><P>

<form action='JdbcPoolDebug.jsp' method='POST'>
<input type='hidden' name='post' value='TRUE'>
<input type='hidden' name='refreshSeconds' value='<%= (PM_refreshSeconds == null) ? "0" : PM_refreshSeconds %>'>
<%= (PM_viewStack != null) ? "<input type=hidden name=viewStack value=yes>" : "" %>

<table width='100%'>
<tr>
<td>Debug ON/OFF</td><td><input type='checkbox' name='debug' value='TRUE' <%= debug ? "checked" : "" %>></td>
<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
<td>Debug to STDOUT ON/OFF</td><td><input type='checkbox' name='debugStdout' value='TRUE' <%= debugStdout ? "checked" : "" %>></td>
</tr>
<tr>
<td>Debug to log file</td><td><input type='checkbox' name='debugFile' value='TRUE' <%= debugFile ? "checked" : "" %>></td>
<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
<td>Debug log file name</td><td><input type='name' name='debugLogName' size='30' value='<%= debugLogName %>'></td>
</tr>
<tr>
<td>Periodic Stack Dump</td><td><input type='text' name='periodicStackDumpSecs' value='<%= periodicStackDumpSecs %>'></td>
<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
<td><input type='submit' value='Set Option'></td><td>&nbsp;</td>
</tr>
</table>

</form>

<form action='JdbcPoolDebug.jsp' method='GET'>
View Stack Trace <input type='checkbox' name='viewStack' value='yes' <%= (PM_viewStack != null) ? "checked" : "" %>>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type='text' name='refreshSeconds' value='<%= (PM_refreshSeconds == null) ? "0" : PM_refreshSeconds %>'>
<input type='submit' value='Refresh Screen'>
</form>

<table width='100%' border=1>
<tr>
	<td width='90%'>Connections : <%= debugConns.size() %></td>
	<td width='10%'>&nbsp;</td>
</tr>

<%
	int count = 0;
	Iterator it = debugConns.keySet().iterator();
	while(it.hasNext()) {
		String strConn = (String)it.next();
		Object[] values = (Object[])debugConns.get(strConn);
		Exception stack = (values.length >= 2) ? (Exception)values[1] : null;
		count++;
%>

		<tr>
			<td width='90%'><font size='2'>[<%= count %>] <%= strConn %></font></td>
			<td width='10%'><font size='2'><a href='JdbcPoolDebug.jsp?conn=<%= strConn %>&<%= (PM_viewStack != null) ? "viewStack=yes" : "" %>'>Close</a></font></td>
		</tr>
		<tr>
			<td colspan=2>

<%
		if(PM_viewStack != null) {
			out.println("<pre>");
			if(stack != null) {
				stack.printStackTrace(new PrintWriter(out));
			}
			out.println("</pre>");
		}
%>

			</td>
		</tr>

<%
	}
%>

</table>

</BODY></HTML>

<!-- JSP : 2004/01/10 -->
