/***************************************************************************************************
* 파일명 : iApprovalDocument.java
* 기능 : 결재처리 - CRM용 결재 공통 처리 interface.
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

import java.util.Calendar;
import java.util.ArrayList;
import java.util.Hashtable;
import javax.servlet.http.HttpServletRequest;
import somo.framework.expt.AppException;
import somo.framework.expt.SysException;

public interface iApprovalDocument {
	
	/********* documentInformation ********/
	
	/**
	 * set documentType
	 * @param docType
	 */
	public void setDocumentType(String docType);
	
	/**
	 * set documentID
	 * @param docID
	 */
	public void setDocumentID(String docID);
	
	/**
	 * set createTime
	 * @param cal
	 */
	public void setCreateTime(Calendar cal);
	
	/**
	 * set modifiedTime
	 * @param cal
	 */
	public void setModifiedTime(Calendar cal);
	
	/**
	 * set createSystem
	 * @param system
	 */
	public void setCreateSystem(String system);
	
	/**
	 * set createServer
	 * @param server
	 */
	public void setCreateServer(String server);
	
	/**
	 * set gccOrganizationCode
	 * @param code
	 */
	public void setGccOrganizationCode(String code);
	
	/**
	 * set creator
	 * @param creator
	 */
	public void setCreator(String creator);
	
	/**
	 * set subject
	 * @param subject
	 */
	public void setSubject(String subject);
	
	/**
	 * get documentType
	 */
	public String getDocumentType();
	
	/**
	 * get document ID.
	 */
	public String getDocumentID();
	
	/**
	 * get createTime
	 */
	public Calendar getCreateTime();
	
	/**
	 * get modifiedTime
	 */
	public Calendar getModifiedTime();
	
	/**
	 * get createSystem
	 */
	public String getCreateSystem();
	
	/**
	 * set createServer
	 */
	public String getCreateServer();
	
	/**
	 * get gccOrganizationCode
	 */
	public String setGccOrganizationCode();
	
	/**
	 * get creator
	 */
	public String getCreator();
	
	/**
	 * get subject
	 */
	public String getSubject();

	
	/********* processInformation ********/
	
	/**
	 * set destinationSystem
	 */
	public void setDestinationSystem(String desSystem);
	
	/**
	 * set recipient
	 * @param recipient
	 */
	public void setRecipient(String recipient);
	
	/**
	 * set documentStatus
	 * @param docStatus
	 */
	public void setDocumentStatus(String docStatus);
	
	/**
	 * get destinationSystem
	 */
	public String getDestinationSystem();
	
	/**
	 * get recipient
	 */
	public String getRecipient();
	
	/**
	 * get documentStatus
	 */
	public String getDocumentStatus();
	
	/********* work item and attaches ********/
	
	/**
	 * add work item.
	 */
	public void addWorkItem(String code, String name, String value);
	
	/**
	 * add attachment
	 * @param seq
	 * @param name
	 * @param url
	 */
	public void addAttachment(String seq, String name, String url);
	
	/**
	 * get work_item list
	 */
	public ArrayList getWorkItems();
	
	/**
	 * get attachment list
	 */
	public ArrayList setAttachment();
	
	/********* processing ********/
	
	/**
	 * get whole document
	 * @return
	 */
	public String getDocument();

	/**
	 * generate approval document
	 * @return
	 */
	public String generateDocument();
	
	/**
	 * set document contents using HttpServletRequest
	 * @param req
	 */
	public void setDocumentContent(HttpServletRequest req) throws AppException, SysException, Exception;
}
