/***************************************************************************************************
* 파일명 : crmApprovalDocument.java
* 기능 : 결재처리 - CRM용 결재 공통 처리 implement.
* 작성일자 : 2009-04-30
* 작성자 : 황성진
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/

package chosun.ciis.co.lib.intf;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Hashtable;
import java.text.SimpleDateFormat;
import javax.servlet.http.HttpServletRequest;

import chosun.ciis.co.base.util.PostDataUtil;

//import chosun.ciis.co.base.util.PostDataUtil;
import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import somo.framework.prop.PropertyManager;

public class crmApprovalDocument implements iApprovalDocument {
	
	private Hashtable docInfos = null;
	private ArrayList workItems = null;
	private ArrayList attaches = null;
	private String doc = null;
	
	/*** documentInformation ***/
	public static final String eleExchDoc = "exchangeableDocument";
	public static final String eleDocInfo = "documentInformation";
	public static final String eleDocType = "documentType";
	public static final String eleDocID = "documentID";
	public static final String eleCrtTime = "createTime";
	public static final String eleModTime = "modifiedTime";
	public static final String eleCrtSys = "createSystem";
	public static final String eleCrtSrv = "createServer";
	public static final String eleOrgCode = "gccOrganizationCode";
	public static final String eleCreator = "creator";
	public static final String eleSubect = "subject";
	/*** processInformation ***/
	public static final String eleProcInfo = "processInformation";
	public static final String eleDest = "destinationSystem";
	public static final String eleRecpt = "recipient";
	public static final String eleDocStat = "documentStatus";
	public static final String eleWorkFlow = "workflow";
	/*** work_item ***/
	public static final String eleWorkItem = "work_item";
	public static final String attWorkItemCode = "work_item_code";
	public static final String attWorkItemName = "work_item_name";
	public static final String txtWorkItemValue = "work_item_value";
	/*** attachments ***/
	public static final String eleFile = "file";
	public static final String eleSeq = "seq";
	public static final String eleName = "name";
	public static final String eleUrl = "url";
	
	/*** document settings ***/
	public static final String dateFormat = "yyyy/MM/dd HH:mm:ss";
	public static final String createSystem = "MIS";
	public static final String companyCD = "100";
	public static String createServer = "";		//"203.255.108.204";
	public static String postURL = ""; 			//"http://220.73.135.220:7777/servlet/com.nanum.xf.servlet.job.XFJobServlet";
	
	/*** approval status ***/
	public static final String statReady = "10";
	public static final String statCreate = "20";
	public static final String statAccepted = "30";
	public static final String statUpdated = "40";
	public static final String statProcess = "50";
	public static final String statReturn = "60";
	public static final String statDelete = "70";
	
	public crmApprovalDocument()
	{
		PropertyManager prop = PropertyManager.getInstance();
		createServer = (String)prop.getProperty("createServer");
		postURL = (String)prop.getProperty("postURL");
	}
	
	public void checkDocInfo()
	{
		if(docInfos == null)
			docInfos = new Hashtable();
	}
	
	public String checkNull(String str)
	{
		return str==null ? "" : str;
	}
	
	public String formatDateTime(Calendar cal)
	{
		if(cal == null)
			return "";
		
		SimpleDateFormat sf = new SimpleDateFormat(dateFormat);
		return sf.format(cal.getTime());
	}
	
	public String getSendErrorMessage(String errCode)
	{
		String msg = "";
		if("001".equals(errCode) || "1".equals(errCode))
			msg = "지정된 사용자 ID가 존재하지 않음";
		else if("002".equals(errCode) || "2".equals(errCode))
			msg = "업무-절차 코드 오류 (jobID에 해당하는 업무를 찾을 수 없거나 양식이 존재하지 않음)";
		else if("003".equals(errCode) || "3".equals(errCode))
			msg = "중복된 문서 ID ";
		else if("090".equals(errCode) || "90".equals(errCode))
			msg = "XML Validation fail. XML 문서에 오류가 있음";
		else if("100".equals(errCode))
			msg = "GW adaptor 내부 오류. DB 접속 불가 등의 이유로 실패";
		else
			msg = "알 수 없는 에러입니다.";
		
		return msg;
	}
	
	/********* documentInformation ********/

	public void setDocumentType(String docType) {
		checkDocInfo();
		docInfos.put(eleDocType, docType);
	}

	public void setDocumentID(String docID) {
		checkDocInfo();
		docInfos.put(eleDocID, docID);
	}

	public void setCreateTime(Calendar cal) {
		checkDocInfo();
		docInfos.put(eleCrtTime, cal);
	}

	public void setModifiedTime(Calendar cal) {
		checkDocInfo();
		docInfos.put(eleModTime, cal);
	}

	public void setCreateSystem(String system) {
		checkDocInfo();
		docInfos.put(eleCrtSys, system);
	}

	public void setCreateServer(String server) {
		checkDocInfo();
		docInfos.put(eleCrtSrv, server);
	}

	public void setGccOrganizationCode(String code) {
		checkDocInfo();
		docInfos.put(eleOrgCode, code);
	}

	public void setCreator(String creator) {
		checkDocInfo();
		docInfos.put(eleCreator, creator);
	}

	public void setSubject(String subject) {
		checkDocInfo();
		docInfos.put(eleSubect, subject);
	}
	
	/**
	 * get documentType
	 */
	public String getDocumentType()
	{
		if(docInfos == null)
			return "";
		
		return checkNull((String)docInfos.get(eleDocType));
	}
	
	/**
	 * get document ID.
	 */
	public String getDocumentID()
	{
		if(docInfos == null)
			return "";
		
		return checkNull((String)docInfos.get(eleDocID));
	}
	
	/**
	 * get createTime
	 */
	public Calendar getCreateTime()
	{
		return (Calendar)docInfos.get(eleCrtTime);
	}
	
	/**
	 * get modifiedTime
	 */
	public Calendar getModifiedTime()
	{
		return (Calendar)docInfos.get(eleModTime);
	}
	
	/**
	 * get createSystem
	 */
	public String getCreateSystem()
	{
		if(docInfos == null)
			return "";
		
		return checkNull((String)docInfos.get(eleCrtSys));
	}
	
	/**
	 * set createServer
	 */
	public String getCreateServer()
	{
		if(docInfos == null)
			return "";
		
		return checkNull((String)docInfos.get(eleCrtSrv));
	}
	
	/**
	 * get gccOrganizationCode
	 */
	public String setGccOrganizationCode()
	{
		if(docInfos == null)
			return "";
		
		return checkNull((String)docInfos.get(eleOrgCode));
	}
	
	/**
	 * get creator
	 */
	public String getCreator()
	{
		if(docInfos == null)
			return "";
		
		return checkNull((String)docInfos.get(eleCreator));
	}
	
	/**
	 * get subject
	 */
	public String getSubject()
	{
		if(docInfos == null)
			return "";
		
		return checkNull((String)docInfos.get(eleSubect));
	}
	
	/********* processInformation ********/

	public void setDestinationSystem(String desSystem) {
		checkDocInfo();
		docInfos.put(eleDest, desSystem);
	}

	public void setRecipient(String recipient) {
		checkDocInfo();
		docInfos.put(eleRecpt, recipient);
	}

	public void setDocumentStatus(String docStatus) {
		checkDocInfo();
		docInfos.put(eleDocStat, docStatus);
	}
	
	/**
	 * get destinationSystem
	 */
	public String getDestinationSystem()
	{
		if(docInfos == null)
			return "";
		
		return checkNull((String)docInfos.get(eleDest));
	}
	
	/**
	 * get recipient
	 */
	public String getRecipient()
	{
		if(docInfos == null)
			return "";
		
		return checkNull((String)docInfos.get(eleRecpt));
	}
	
	/**
	 * get documentStatus
	 */
	public String getDocumentStatus()
	{
		if(docInfos == null)
			return "";
		
		return checkNull((String)docInfos.get(eleDocStat));
	}
	
	/********* common setting for document/processing information **********/
	
	public void setInformation(String node, Object value)
	{
		checkDocInfo();
		docInfos.put(node, value);
	}
	
	public Object getInformation(String node)
	{
		if(docInfos == null)
			return null;
		return docInfos.get(node);
	}
	
	/********* work item and attaches ********/

	public void addWorkItem(String code, String name, String value)
	{
		if(workItems == null)
			workItems = new ArrayList();
		
		Hashtable ht = new Hashtable();
		ht.put(attWorkItemCode, code);
		ht.put(attWorkItemName, name);
		ht.put(txtWorkItemValue, value);
		
		workItems.add(ht);
	}
	
	public void addAttachment(String seq, String name, String url)
	{
		if(attaches == null)
			attaches = new ArrayList();
		
		Hashtable ht = new Hashtable();
		ht.put(eleSeq, seq);
		ht.put(eleName, name);
		ht.put(eleUrl, url);
		
		attaches.add(ht);
	}
	
	public ArrayList getWorkItems()
	{
		return workItems;
	}
	
	public ArrayList setAttachment()
	{
		return attaches;
	}
	
	/********* processing ********/

	public String getDocument() {
		return doc;
	}
	
	public String generateDocument() {
		StringBuffer sbDoc = new StringBuffer();
		
		//generate document.
		//xml definition.
		sbDoc.append("<?xml version=\"1.0\" encoding=\"euc-kr\"?>");
		sbDoc.append("<exchangeableDocument>");
		//documentInformation
		sbDoc.append("<documentInformation>");
		sbDoc.append("<").append(eleDocType).append(">").append(getDocumentType()).append("</").append(eleDocType).append(">");
		sbDoc.append("<").append(eleDocID).append(">").append(getDocumentID()).append("</").append(eleDocID).append(">");
		sbDoc.append("<").append(eleCrtTime).append(">").append(formatDateTime(getCreateTime())).append("</").append(eleCrtTime).append(">");
		sbDoc.append("<").append(eleModTime).append(">").append(formatDateTime(getModifiedTime())).append("</").append(eleModTime).append(">");
		sbDoc.append("<").append(eleCrtSys).append(">").append(getCreateSystem()).append("</").append(eleCrtSys).append(">");
		sbDoc.append("<").append(eleCrtSrv).append(">").append(getCreateServer()).append("</").append(eleCrtSrv).append(">");
		sbDoc.append("<").append(eleOrgCode).append(">").append(setGccOrganizationCode()).append("</").append(eleOrgCode).append(">");
		sbDoc.append("<").append(eleCreator).append(">").append(getCreator()).append("</").append(eleCreator).append(">");
		sbDoc.append("<").append(eleSubect).append(">").append(getSubject()).append("</").append(eleSubect).append(">");
		sbDoc.append("</documentInformation>");
		//processInformation
		sbDoc.append("<processInformation>");
		sbDoc.append("<").append(eleDest).append(">").append(getDestinationSystem()).append("</").append(eleDest).append(">");
		sbDoc.append("<").append(eleRecpt).append(">").append(getRecipient()).append("</").append(eleRecpt).append(">");
		sbDoc.append("<").append(eleDocStat).append(">").append(getDocumentStatus()).append("</").append(eleDocStat).append(">");
		sbDoc.append("<workflow>");
		sbDoc.append("</workflow>");
		sbDoc.append("</processInformation>");
		//documentDescription
		sbDoc.append("<documentDescription>");
		sbDoc.append("<work>");
		sbDoc.append("<work_manage>");
		sbDoc.append("<job_name/>");
		sbDoc.append("<start_date/>");
		sbDoc.append("<open_term/>");
		sbDoc.append("<dept_name/>");
		sbDoc.append("<district_name/>");
		sbDoc.append("</work_manage>");
		sbDoc.append("<work_ref/>");
		sbDoc.append(generateWorkItems());
		sbDoc.append("</work>");
		sbDoc.append("</documentDescription>");
		//documentBody
		sbDoc.append("<documentBody>");
		sbDoc.append("<business>");
		sbDoc.append("<biz_name/>");
		sbDoc.append("</business>");
		sbDoc.append("<process>");
		sbDoc.append("<proc_name/>");
		sbDoc.append("<ins_date/>");
		sbDoc.append("<dept_name/>");
		sbDoc.append("<chg_resno/>");
		sbDoc.append("<chg_name/>");
		sbDoc.append("<chg_phone/>");
		sbDoc.append("<chg_email/>");
		sbDoc.append("<proc_content/>");
		sbDoc.append("</process>");
		sbDoc.append("</documentBody>");
		//attachments
		sbDoc.append("<attachments>");
		sbDoc.append(generateAttachments());
		sbDoc.append("</attachments>");
		sbDoc.append("</exchangeableDocument>");
		
		//set document in global variable
		doc = sbDoc.toString();
		
		return doc;
	}
	
	public String generateWorkItems()
	{
		StringBuffer sbwi = new StringBuffer("");
		
		if(workItems != null)
		{
			for(int i=0; i<workItems.size(); i++)
			{
				sbwi.append("<").append(eleWorkItem).append(" ");
				sbwi.append(attWorkItemCode).append("=\"").append(getWorkItemContent(i, attWorkItemCode)).append("\" ");
				sbwi.append(attWorkItemName).append("=\"").append(getWorkItemContent(i, attWorkItemName)).append("\">");
				sbwi.append(getWorkItemContent(i, txtWorkItemValue));
				sbwi.append("</").append(eleWorkItem).append(">");
			}
		}
		
		return sbwi.toString();
	}
	
	public String getWorkItemContent(int idx, String nodeName)
	{
		if(workItems == null || idx >= workItems.size())
			return "";
		
		return checkNull((String)((Hashtable)workItems.get(idx)).get(nodeName));
	}
	
	public String generateAttachments()
	{
		StringBuffer sbatt = new StringBuffer("");
		
		if(attaches != null)
		{
			for(int i=0; i<attaches.size(); i++)
			{
				sbatt.append("<").append(eleFile).append(">");
				sbatt.append("<").append(eleSeq).append(">").append(getAttachContent(i, eleSeq)).append("</").append(eleSeq).append(">");
				sbatt.append("<").append(eleName).append(">").append(getAttachContent(i, eleName)).append("</").append(eleName).append(">");
				sbatt.append("<").append(eleUrl).append(">").append(getAttachContent(i, eleUrl)).append("</").append(eleUrl).append(">");
				sbatt.append("</").append(eleFile).append(">");
			}
		}
		
		return sbatt.toString();
	}
	
	public String getAttachContent(int idx, String nodeName)
	{
		if(attaches == null || idx >= attaches.size())
			return "";
		
		return checkNull((String)((Hashtable)attaches.get(idx)).get(nodeName));
	}
	
	public void send(HttpServletRequest req, String docType) throws AppException, SysException, Exception
	{
		try {
			StringBuffer param = new StringBuffer();
			param.append("protID=").append("createDoc").append("&");
			param.append("userID=").append(req.getSession().getAttribute("uid")).append("&");
			param.append("jobID=").append(docType).append("&");
			param.append("docID=").append(getDocumentID()).append("&");
			param.append("Document=").append(getDocument());
			
    		String resultXml = PostDataUtil.Post(postURL, param.toString());
    		//System.out.println("resultXml=" + resultXml);

    		String status = PostDataUtil.getXmlParsing(resultXml, "status");
    		String message = PostDataUtil.getXmlParsing(resultXml, "message");	//message와 code가 문서대로 오지 않음.
    		String code = PostDataUtil.getXmlParsing(resultXml, "code");
    		
    		if(message==null || message.equals("") || message.equals("null"))
    			message = getSendErrorMessage(code);
    		
    		if(!"Success".equals(status))
 	    		throw new AppException(code, "[결재 오류] " + message);
    		
		} catch (AppException e) {
        	//e.printStackTrace();
            //LogManager.getInstance().log(se);
            throw e;
       } catch (Exception e) {
        	e.printStackTrace();
            SysException se = new SysException(e);
            //LogManager.getInstance().log(se);
            throw se;
       }
	}

	/********** below method will be redefined for each business process **********/
	/**
	 * 
	 */
	public void setDocumentContent(HttpServletRequest req) throws AppException, SysException, Exception
	{
		Hashtable ht = new Hashtable();
		ArrayList arrwi = new ArrayList();
		ArrayList arrat = new ArrayList();
		
		this.docInfos = ht;
		this.workItems = arrwi;
		this.attaches = arrat;
	}
}
