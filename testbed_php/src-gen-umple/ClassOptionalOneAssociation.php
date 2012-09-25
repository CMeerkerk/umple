<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.15.0.1751 modeling language!*/

class ClassOptionalOneAssociation
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //ClassOptionalOneAssociation Associations
  private $otherclass;

  //Helper Variables
  private $canSetOtherclass;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct($aOtherclass)
  {
    $this->canSetOtherclass = true;
    $this->setOtherclass($aOtherclass);
  }

  //------------------------
  // INTERFACE
  //------------------------

  public function getOtherclass()
  {
    return $this->otherclass;
  }

  private function setOtherclass($newOtherclass)
  {
    $wasSet = false;
    if (!$this->canSetOtherclass) { return false; }
    $this->canSetOtherclass = false;
    $this->otherclass = $newOtherclass;
    $wasSet = true;
    return $wasSet;
  }

  public function equals($compareTo)
  {
    return $this == $compareTo;
  }

  public function delete()
  {}

}
?>