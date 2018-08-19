$installState = get-WmiObject -query "select * from Microsoft-Windows-Subsystem-Linux where installstate= 1"
if ($installState -eq $NULL){
    Enable-WindowsOptionalFeature -Online -FeatureName Microsoft-Windows-Subsystem-Linux
    Restart-Computer
}
Write-Host "Install ubuntu for linux subsystem from the Microsoft Store.  The store will open to the correct utility in 60 seconds..."
Start-Sleep -Seconds 60
Start-process -Path "https://www.microsoft.com/en-us/p/ubuntu/9nblggh4msv6?rtc=1&activetab=pivot%3aoverviewtab"
#TODO Finish linux subsystem setup portion