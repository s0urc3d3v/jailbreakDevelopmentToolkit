cd ~
echo "Installing homebrew"
/usr/bin/ruby -e "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/master/install)"
echo "Installing ldid and xz via homebrew"
brew install ldid xz
echo "Adding $THEOS to .bash_profile"
"THEOS=~/theos" >> .bash_profile
source .bash_profile
echo "Downloading theos, this may take a while depending on your internet connection"
git clone --recursive https://github.com/theos/theos.git ~/theos



